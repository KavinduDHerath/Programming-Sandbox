import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many times do you need to find the sum of digits?: ");
        int repeats = input.nextInt();
        System.out.println();

        for (int i = 0; i < repeats; i++) {
            System.out.print("Enter a number to print the sum of digits: ");
            int num = input.nextInt();

            int sum = 0;

            while (num != 0) {
                int digit = num % 10;

                sum += digit;

                num /= 10;

            }

            System.out.println("The sum of digits is " + sum);
            System.out.println();
        }

    }
}
