import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number 🤖: ");
        int num = input.nextInt();

        while (num != 0) {
            System.out.print(num % 10);
            num /= 10;

        }

    }
}
