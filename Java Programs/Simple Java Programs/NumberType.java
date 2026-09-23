import java.util.Scanner;
public class NumberType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even");
            }
            else {
                System.out.println("Odd");
            }
        }
    }
}
