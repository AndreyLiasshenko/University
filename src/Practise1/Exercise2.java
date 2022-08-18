package Practise1;
//Напишіть програму, яка зчитує ціле число та виводить текст, аналогічний наведеному у
//прикладі. Прогалини, розділові знаки, великі і малі літери важливі!
//Вхідні дані
//Вводиться ціле число, за модулем, що не перевищує 10000.

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();

        if (number > 10000) {
            System.out.println("Error: number is more 10000");
            return;
        }

        System.out.println("The next number for number " + number +" is " + (number + 1));
        System.out.println("The previous number for number " + number +" is " + (number - 1));
    }
}
