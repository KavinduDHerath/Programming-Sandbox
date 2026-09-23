import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Smallest Number is " + Math.min(num1,num2));
        System.out.println("Larger Number is " + Math.max(num1,num2));

    }
}