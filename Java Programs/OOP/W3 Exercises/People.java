public class People {
    //Declare a private variable to stote the name of the person
    private String name;
    //Declare a private variable to store the age of the person
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        System.out.println("This is W3Resources Sample File! 🌐");
        System.out.println();

        People person1 = new People("Kavindu Darshana", 24);
        People person2 = new People("Harry Potter", 22);

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");

        person1.setAge(34);
        person1.setName("Kavindu Darshana Herath");

        person2.setName("Ron Viesly");
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");
    }

}
