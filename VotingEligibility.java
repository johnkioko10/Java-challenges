//Choices
import java.util.Scanner;

    public class VotingEligibility {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter your age: ");
            int age = scanner.nextInt();


            boolean isEligible = age >= 18;

            if (isEligible) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are NOT eligible to vote.");
            }

            scanner.close();
        }
    }


