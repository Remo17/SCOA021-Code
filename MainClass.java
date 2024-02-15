
/**
 * MainClass
 */

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Welcome to Java");
        System.out.print("Welcome to SCOA021");
        System.out.println("Welcome to Class");
        System.out.print("Welcome to Remo"); // without println, it will continue executing on the same line
        System.out.println("Welcome to xyz");

        Scanner scanner = new Scanner(System.in);
        /*
         * { System.out.println("Enter the first Number");
         * int num1 = scanner.nextInt();
         * 
         * System.out.println("Enter the second Number");
         * int num2 = scanner.nextInt();
         * 
         * int sum = num1 + num2;
         * 
         * System.out.println("the sum of " + num1 + " and " + num2 + " is " + sum);
         */

        System.out.println("Enter your name"); // to prompt the user to enter their name
        String name = scanner.nextLine();// to get the name from the user in the terminal

        System.out.println("Enter your surname");
        String surname = scanner.nextLine();

        System.out.println(" Your name is " + name + " Your surname is " + surname);// to print the final output

    }
}