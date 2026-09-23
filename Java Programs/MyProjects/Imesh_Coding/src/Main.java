import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to generate its Hailstone sequence: ");
        int number = scanner.nextInt();

        int count = 0;
        System.out.print("Sequence: ");
        while (number != 1) {
            System.out.print(number + " ");
            if (number % 2 == 0)
                number /= 2;
            else
                number = number * 3 + 1;
            count++;
        }
}}