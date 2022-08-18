package Practise1;
//N школярів ділять K яблук порівну, залишок, що не ділиться, залишається в кошику.
//Скільки яблук дістанеться кожному школяреві?
//Вхідні дані
//Програма отримує вхід числа N і K.
//Вихідні дані
//Програма повинна вивести кількість яблук.

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of schoolboys:");
        int schoolboys = scanner.nextInt();
        System.out.println("Enter the amount of apples");
        int apples = scanner.nextInt();
        System.out.println("Each one schoolboy will have " + (apples / schoolboys));
    }

}
