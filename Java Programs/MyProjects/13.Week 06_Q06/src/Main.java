import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sn = new Scanner(System.in);
       System.out.print("Enter the Side 01 Length: ");
       int side1 = sn.nextInt();
       System.out.print("Enter the Side 02 Length: ");
       int side2 = sn.nextInt();
       System.out.print("Enter the Side 03 Length: ");
       int side3 = sn.nextInt();

       if (side1 == side2 && side2 == side3)
       {
           System.out.println("The Triangle is an Equilateral Triangle");
       }
       else if (side1 == side2 || side2 == side3 || side1 == side3)
       {
           System.out.println("The Triangle is an Isosceles Triangle");
       }
       else
       {
           System.out.println("The Triangle is a Scalene Triangle");
       }
    }
}