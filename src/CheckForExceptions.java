import java.util.Scanner;

public class CheckForExceptions {
    // проверяем 1 инпут на недопустимые знаки

    int checkForDigit() {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            String toPrint = scanner.nextLine();
            System.out.printf("Error: \"%s\" isn't a valid number.", toPrint);
            System.exit(5);
        }
        return scanner.nextInt();
    }

    // проверяем 1 инпут на длину
    void checkForLength(int length) {
        if (length > 36 || length < 1) {
            System.out.println("Error: maximum length of the secret code is 36");
            System.exit(2);
        }
    }
    void checkForSymbolsLength(int length) {
        if (length > 36 || length < 1) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(2);
        }
    }

    void checkForInputsEquality(int length, int symbolsLen) {
        if (length > symbolsLen) {
            System.out.printf("Error: it's not possible to generate a code with a length of %d with %d unique symbols.", length, symbolsLen);
            System.exit(3);
        }
    }

    void checkForVariant(String input, int len) {
        if (input.length() != len) {
            System.out.printf("Error: Wrong input. You had to write %d symbols", len);
            System.exit(4);
        }
    }
}
