import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        String str1 = scanner.nextLine();

        System.out.println("Введіть другий рядок:");
        String str2 = scanner.nextLine();

        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 > length2) {
            System.out.println("Перший рядок має більше символів.");
        } else if (length2 > length1) {
            System.out.println("Другий рядок має більше символів.");
        } else {
            System.out.println("Рядки мають однакову кількість символів.");
        }
    }
}