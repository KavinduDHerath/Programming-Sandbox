import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kalana = new Scanner(System.in);
        System.out.println("Student Mark sheet");
        System.out.println();
        System.out.print("Enter Java Score: ");
        int S1 = kalana.nextInt();
        System.out.print("Enter C# Score: ");
        int S2 = kalana.nextInt();
        System.out.print("Enter Web Design Score: ");
        int S3 = kalana.nextInt();
        System.out.print("Enter C++ Score: ");
        int S4 = kalana.nextInt();
        System.out.print("Enter Python Score: ");
        int S5 = kalana.nextInt();
        System.out.print("Enter Go Score: ");
        int S6 = kalana.nextInt();
        System.out.println();

        System.out.println("Student Mark Report");
        System.out.println();
        int total = S1 + S2 + S3 + S4 + S5 + S6;
        System.out.println("Total mark is " + total);
        int avg = total / 6;
        System.out.println("Your Average Mark is " + avg);

        if ( avg >= 75 ) {
            System.out.println("Your Average Grade is 'A'");
        } else if (avg >= 65) {
            System.out.println("Your Average Grade is 'B'");
        }
        else if (avg >= 55) {
            System.out.println("Your Average Grade is 'C'");
        }
        else if (avg >= 35) {
            System.out.println("Your Average Grade is 'S'");
        }
        else {
            System.out.println("Your Average Grade is 'W'");
        }
    }
}