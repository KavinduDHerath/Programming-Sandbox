import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {

        System.out.print("Enter the number to calculate the factorial ⚛️: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial + " ✅");
    }
}
