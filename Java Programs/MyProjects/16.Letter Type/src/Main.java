import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter a Letter: ");
        char letter = sn.next().charAt(0);
        switch (letter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The Letter You Entered is a vowel ");
                break;
            default:
                System.out.println("The Letter You Entered is a Consonant");
                int x = 11;
                int y = 16;
                float z = x + y;
                System.out.println(z);
        }
    }
}