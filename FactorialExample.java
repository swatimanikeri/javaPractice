public class FactorialExample {

    // Function to find factorial
    public static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        int number = 5; // you can change this value
        long result = factorial(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
