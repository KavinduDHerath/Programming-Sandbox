import java.util.Scanner;

public class PrintingPrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

            System.out.print("Enter Number of Copies to be Printed 📄🖨️: ");
            int copies = input.nextInt();

            if (copies < 1) {
                System.out.println("⚠️ Enter a Valid Number of Copies! 🚫");
            } else if (copies < 100) {
                System.out.println("Price for a copy is LKR.30.00 🪙");
                System.out.println("Total price is " + (copies * 30.00) + " 💵");
            } else if (copies < 500) {
                System.out.println("Price for a copy is LKR.28.00 🪙");
                System.out.println("Total price is " + (copies * 28.00) + " 💵");
            } else if (copies < 800) {
                System.out.println("Price for a copy is LKR.27.00 🪙");
                System.out.println("Total price is " + (copies * 27.00) + " 💵");
            } else if (copies < 1001) {
                System.out.println("Price for a copy is LKR.26.00 🪙");
                System.out.println("Total price is " + (copies * 26.00) + " 💵");
            } else {
                System.out.println("Price for a copy is LKR.25.00 🪙");
                System.out.println("Total price is " + (copies * 25.00) + " 💵");
            }
    }
}