//Imports:Scanner
import java.util.Scanner;

    public class EvenOddChecker {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Boolean expression to check if number is even
            boolean isEven = number % 2 == 0;

            // Use boolean expression in a decision
            if (isEven) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }

            scanner.close();
        }
    }


