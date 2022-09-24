import java.util.Scanner;

public class guess_the_number {
    public static boolean newStep() {
        int number = (int) (Math.random()*100);
        Scanner scanner = new Scanner(System.in);
        int input=0;
        System.out.println(number);
        while (true) {
            input = scanner.nextInt();
            if (input == number) return true;
            else if (input < number) {
                System.out.println("Don't guessed) try higher.");
            } else if (input > number) {
                System.out.println("Don't guessed) try lower.");
            }
        }
    }

    public static void main(String[] args) {
        int score = 0;
        System.out.println("Hi, it's a 'guess a number' game!");
        System.out.println("Rules: You need to enter a number that I guessed");

        for (int i=0; i<3; i++) {
            boolean step = newStep();
            if (step) {
                score += 10;
                System.out.println("Amazing! Your score is " + score);
            }
        }

    }
}
