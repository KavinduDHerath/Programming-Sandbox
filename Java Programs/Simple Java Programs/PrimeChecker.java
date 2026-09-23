import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a prime number: ");
        int num = input.nextInt();

        if (num < 2) {
            System.out.println(num + " is not a prime number");
        } else if (num == 2) {
            System.out.println(num + " is a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
            }
        input.close();

    }
}
