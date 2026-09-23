interface A {
    void display();
}

interface B extends A {
    default void display() {
        System.out.println("Display from B");
    }
}

interface C extends A {
    default void display() {
        System.out.println("Display from C");
    }
}

class D implements B, C {
    //Overriding the display method to resolve ambiguity
    @Override
    public void display() {
        //Choose which display to call, or create a custom implementation
        B.super.display(); //Calls display from interface B
        //Alternatively, you could call C.super.display(); or have a custom print
        //C.super.display();
        System.out.println("Display from D (resolved)");
    }
}

public class Q03 {
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }
}
