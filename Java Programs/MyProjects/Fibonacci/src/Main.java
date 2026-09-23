public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c;
        int sum;

        for(int i =1;i <= 10;i++) {
            c = a + b;
            if (c % 2 == 0) {
                sum = c;
                System.out.println(c);
            }
        }
    }
}