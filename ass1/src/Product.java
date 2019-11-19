import java.util.Scanner;

public class Product {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // making a new scanner object

        // prompting an input for the first number
        System.out.print("Number1: ");
        int number1 = scanner.nextInt();

        // prompting an input for the second number
        System.out.print("Number2: ");
        int number2 = scanner.nextInt();

        int product = number1 * number2;    // calculate the product of two numbers
        System.out.println("product: " + product);  // print out the product
    }
}