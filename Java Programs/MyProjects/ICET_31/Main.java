import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a Number: ");
	int buzz = input.nextInt();
	
	int rem;
	
	if (buzz % 7 == 0) {
		System.out.println("You have Entered a Buzz Number");
	}
	
	else {
		rem = buzz % 10;
		
		if (rem % 7 == 7) {
			System.out.println("You have Entered a Buzz Number");
		}
		
		else {
			System.out.println("The Number You Entered isn't a Buzz Number");
		}
	}
	
	}
}
