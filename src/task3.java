import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три числа:");

        double number1 = 0;
        double number2 = 0;
        double number3 = 0;

        // Введення першого числа
        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
        } else {
            System.out.println("Помилка! Введіть дробове число.");
            return;
        }

        // Введення другого числа
        if (scanner.hasNextDouble()) {
            number2 = scanner.nextDouble();
        } else {
            System.out.println("Помилка! Введіть дробове число.");
            return;
        }

        // Введення третього числа
        if (scanner.hasNextDouble()) {
            number3 = scanner.nextDouble();
        } else {
            System.out.println("Помилка! Введіть дробове число.");
            return;
        }

        double maxNumber = Math.max(number1, Math.max(number2, number3));

        System.out.println("Найбільше дробове число: " + maxNumber);
    }
}