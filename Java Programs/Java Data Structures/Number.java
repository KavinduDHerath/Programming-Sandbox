import java.awt.*;

public class Number {
    public static void main(String[] args) {
        int[] integers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        integers[8] = 100;
        integers[9] = 110;

        for (int print : integers) {
            System.out.println(print);
        }
        System.out.println();

        String[] boy = new String[5];
        String[] girl = new String[5];

        boy[0] = "Kavindu";
        girl[0] = "Sarah";

        boy[1] = "Imesh";
        girl[1] = "Thilini";

        boy[2] = "Mikhail";
        girl[2] = "Chama";

        boy[3] = "Ashen";
        girl[3] = "Gayuu";

        boy[4] = "Naween";
        girl[4] = "Heshi";

        for (String display : boy) {
            System.out.println(display);
            System.out.println();
        }
        System.out.println();

        for (String show : girl) {
            System.out.println(show);
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println(integers[1] + integers[5] + integers[7]);



    }
}
