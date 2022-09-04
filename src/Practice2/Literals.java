package Practice2;

import java.util.Scanner;

public class Literals {
    public static void literals() {
        System.out.println(true);
        System.out.println("hello world");
        System.out.println('4');
        System.out.println(0b11101);
        System.out.println(074);
        System.out.println(4456);
        System.out.println(0x1324);
        System.out.println(4456f);
        System.out.println(1324d);
    }


    public static int calculator(int n1, int n2) {
        return n1 + n2;
    }

    public static int even_Not_even(int num) {
        int result=0;
        if ((num % 2) == 0) result = num;
        return result;
    }

    public static void numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if (num >= 0 && num <= 10) System.out.println("number is less 10 or = zero");
        else System.out.println("Number is more than 10 or negative");
    }

    public static void daysOfweekend(int day) {
        String[] arrOfDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Monday"};
        if (day >= 1 && day <= 7) System.out.println(arrOfDays[day-1]);
    }

    public static int factorial(int n) {
        int result=1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        literals();
        System.out.println(calculator(1,2));
        System.out.println(even_Not_even(22));
        numbers();
        daysOfweekend(3);

        int i = 1;
        while (i != 11) {
            System.out.println("Task" + i);
            i++;
        }

        int counter = 0;
        do {
            if ((counter % 5) == 0) System.out.println(counter);
            counter++;
        } while (counter <= 100);


        System.out.println(factorial(4));
    }


}
