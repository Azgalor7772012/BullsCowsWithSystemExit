import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckForExceptions check = new CheckForExceptions();

        //Просим ввести длину кода и проверяем, чтобы это было число
        System.out.println("Input the length of the secret code:");
        int length = check.checkForDigit();
        // Проверяем на то, чтобы длина была меньше 36 символов
        check.checkForLength(length);
        // Просим ввести количество символом и проверяем, чтобы это было число
        System.out.println("Input the number of possible symbols in the code:");
        int symbolsAmount = check.checkForDigit();
        // Проверяем на то, чтобы длина была меньше 36 символов
        check.checkForSymbolsLength(symbolsAmount);
        //Проверяем на то, чтобы количество символов было не меньше длины секретного кода
        check.checkForInputsEquality(length,symbolsAmount);
        //Генерируем случайное число
        RandomNumber random = new RandomNumber(length, symbolsAmount);
        random.randomNumber();
        Evaluator evaluator = new Evaluator();
        while (random.getNumberLength() != evaluator.getBulls()) {
            //Получаем пользовательское число + считаем какой ход
            evaluator.getPlayerNumber();
            //Проверяем на длину введенного кода
            check.checkForVariant(evaluator.getPersonNumber(), length);
            // Смотрим сколько коров и быков
            evaluator.checker();
            // Печатаем
            evaluator.printer();
        }


    }
}
