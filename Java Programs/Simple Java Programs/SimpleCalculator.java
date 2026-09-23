import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <= 10; ++i) {
            System.out.print("Enter First Number: ");
            int input1 = input.nextInt();

            System.out.print("Enter Operator: ");
            char operator = input.next().charAt(0);

            System.out.print("Enter Second Number: ");
            int input2 = input.nextInt();

            if (operator == '+') {
                int sum = input1 + input2;
                System.out.println("The sum is: " + sum);
            }
            else if (operator == '-') {
                int sum = input1 - input2;
                System.out.println("The subtraction is: " + sum);
            }
            else if (operator == '*') {
                int sum = input1 * input2;
                System.out.println("The multiplication is: " + sum);
            }
            else if (operator == '/') {
                int sum = input1 / input2;
                System.out.println("The division is: " + sum);
            }
        }


    }
}
