package Practise1;
import java.util.Scanner;
//Дано два числа a та b. Знайдіть гіпотенузу трикутника із заданими катетами.
//Вхідні дані
//У двох рядках вводяться два числа (числа цілі, позитивні, не перевищують 1000).
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        if (a > 1000 || a < 0 || b > 1000 || b < 0) {
            System.out.println("Error");
            return;
        }

        double result = Math.sqrt((a * a) + (b * b));
        System.out.println("Result: "+result);
    }
}
