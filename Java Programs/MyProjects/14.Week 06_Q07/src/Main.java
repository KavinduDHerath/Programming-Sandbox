import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = sn.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");//2400,2800,3200,3600,4000,4400
                } else {
                    System.out.println(year + " is not a Leap Year");//2100,2200,2300,2500
                }
            } else {
                System.out.println(year + " is a Leap Year");//2004,2008,2012,2016,2020,2024
            }
        } else {
            System.out.println(year + " is not a Leap Year");//2001,2002,2003,2005,2006
        }
    }
}