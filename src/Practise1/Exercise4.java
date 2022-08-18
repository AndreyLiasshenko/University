package Practise1;
import java.util.Scanner;
//N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
//Скільки яблук залишиться у кошику?
//Вхідні дані
//Програма отримує вхід числа N і K.

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of schoolboys:");
        int schoolboys = scanner.nextInt();
        System.out.println("Enter the amount of apples");
        int apples = scanner.nextInt();
        System.out.println("In the basket " + (apples % schoolboys) + " apples");
    }
}
