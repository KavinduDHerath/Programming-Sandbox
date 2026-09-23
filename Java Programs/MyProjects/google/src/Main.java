public class Main {

    public static void main(String[] args) {
        int n = 11; // Number of terms in the Fibonacci sequence

        // Print the first n terms of the Fibonacci sequence
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}