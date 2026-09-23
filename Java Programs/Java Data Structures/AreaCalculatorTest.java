import java.util.Scanner;
public class AreaCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double iRadius = input.nextDouble();

        AreaCalculator calculator = new AreaCalculator();

        double area = calculator.getArea(iRadius);
        double circumference = calculator.getCircumference(iRadius);

        System.out.println("Value of Area is: " + area);
        System.out.println("Value of Circumference is: " + circumference);

    }
}
