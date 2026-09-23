public class Person {
    Person (String name, int age) {
        System.out.println("Hello! 🙋‍♂️ I am " + name + " 👨‍💻😎");
        System.out.println("I'm " + age + ". ☺️");
    }
    public static void main(String[] args) {
        System.out.println();
        Person me = new Person("Kavindu", 24);
    }
}