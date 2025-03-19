import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Print a message
        System.out.println("Hello, World!");

        // Take user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        scanner.close();
    }
}
