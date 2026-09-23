import java.util.Scanner;

public class AlphabetCharacterChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a alphabetic Character 🔠: ");
        char letter = input.next().charAt(0);

        if ("aeiouAEIOU".indexOf(letter) != -1) {
            System.out.println("You have entered a vowel. ♈");
        } else {
            System.out.println("You have entered a consonant");
        }
    }
}
