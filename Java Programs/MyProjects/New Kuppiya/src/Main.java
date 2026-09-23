import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("...........................");
        System.out.println("|  SALARY INFORMATION SYSTEM  |");
        System.out.println(".............................");

        System.out.println("\n\t[1] Calculate Income Tax");
        System.out.println("\n\t[2] Calculate Annual Bonus");
        System.out.println("\n\t[3] Calculate Loan Amount");

        System.out.println("\nEnter an Option to Continue > ");
        int option= input.nextInt();

        switch(option) {
            case 1:
                System.out.println("Calculate Income Tax");
                break;

            case 2:
                System.out.println("Calculate Annual Bonus");
                break;

            case 3:
                System.out.println("Calculate Loan Amount");
                break;
        }
    }

}