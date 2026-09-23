import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the Start Reading");
        int start = sn.nextInt();
        System.out.println("Enter the End Reading");
        int end = sn.nextInt();
        int usage = end - start;
        int amount = 0;
        if (usage <= 90)
        {
            amount = usage * 8;
        }
        else if (usage <= 150)
        {
            amount = (90 * 8) + (usage - 90) * 12;
        }
        else if (usage <= 200)
        {
            amount = (90 * 8) + (60 * 12) + (usage - 150) * 15;
        }
        else
        {
            amount = (90 * 8) + (60 * 12) + (50 * 15) + (usage - 200) * 20;
        }
        System.out.println("Your monthly electricity bill is Rs." + amount);
    }
}