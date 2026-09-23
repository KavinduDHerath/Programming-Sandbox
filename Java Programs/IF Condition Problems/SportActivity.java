import java.util.Scanner;

public class SportActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Temperature ♨️: ");
        int temp = input.nextInt();

        if (temp >= 80) {
            System.out.println("It is better to Swim in this temperature Sir! 🏊");
        } else if (temp >= 60) {
            System.out.println("It is better to play Tennis Sir! 🎾");
        } else if (temp >= 40) {
            System.out.println("It is better to play Golf Sir! 🏌️");
        } else {
            System.out.println("It is better to play Skiing Sir! ⛷️");
        }
    }
}
