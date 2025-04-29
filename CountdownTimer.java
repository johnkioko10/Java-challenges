// While loop
import java.util.Scanner;

public class CountdownTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to start the countdown: ");
        int number = scanner.nextInt();

        System.out.println("Starting countdown...");

        // while loop: count down to zero
        while (number >= 0) {
            System.out.println(number);
            number--; // decrease the number by 1 each time
        }

        System.out.println("Countdown finished!");

        scanner.close();
    }
}

