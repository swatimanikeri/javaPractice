import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two integer inputs
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculating sum
        int sum = num1 + num2;

        // Displaying result
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}
