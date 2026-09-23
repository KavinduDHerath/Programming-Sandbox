import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First number");
        int in1 = input.nextInt();

        System.out.println("Enter Second number");
        int in2 = input.nextInt();

        int sum = in1 + in2;

        System.out.println(sum);
    }


}
