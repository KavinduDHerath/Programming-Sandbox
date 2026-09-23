import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter Your rating: ");
        int rating = input.nextInt();

        if (rating == 1) {
            double raise = 0.06 * salary;
            double newSalary = raise + salary;
            System.out.println("Your raise is " + raise);
            System.out.println("Your New Salary is " + newSalary);
        }

        else if (rating == 2) {
            double raise = 0.04 * salary;
            double newSalary = raise + salary;
            System.out.println("Your raise is " + raise);
            System.out.println("Your New Salary is " + newSalary);
        }

        else if (rating == 3) {
            double raise = 0.015 * salary;
            double newSalary = raise + salary;
            System.out.println("Your raise is " + raise);
            System.out.println("Your New Salary is " + newSalary);
        }

        else {
            System.out.println("Your Salary is " + salary);
        }
    }
}
