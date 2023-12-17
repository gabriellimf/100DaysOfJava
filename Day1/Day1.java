package Day1;

import java.security.SecureRandom;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generating a random number between...");
        int number1 = sc.nextInt();

        System.out.println("and...");
        int number2 = sc.nextInt();

        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(number2 - number1 + 1) + number1;
        System.out.println("The random number is: " + randomNumber);
    }
}
