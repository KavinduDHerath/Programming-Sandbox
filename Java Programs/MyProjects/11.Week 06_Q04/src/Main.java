import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter Number 01: ");
        int no1 = sn.nextInt();
        System.out.print("Enter Number 02: ");
        int no2 = sn.nextInt();
        if (no1 % no2 == 0)
        {
            System.out.println("First Number can be perfectly divisible by Second Number");
        }
        else
        {
            System.out.println("First Number can not be perfectly divisible by Second Number");
        }
    }
}