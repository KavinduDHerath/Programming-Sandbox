import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        Double price = 600.0;
        Double VAT = (price * (18.0/100.0));
        System.out.println("Enter number of Carrot Killos bought: ");
        Double input = kavi.nextDouble();
        Double total = input * (price + VAT);
        System.out.println("Price of 1 Kg of Carrot is Rs." + price);
        System.out.println("VAT for 1 Kg is " + VAT);
        System.out.println("Total price for carrot bought is Rs." + total);

    }
}