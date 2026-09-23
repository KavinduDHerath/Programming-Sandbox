public class TestStudentDetails {
    public static void main(String[] args) {
        //Invoke relevant methods and print the values of name and age as follows
        //Create an instance of StudentDetails
        StudentDetails student = new StudentDetails();

        //Alex (name) is 23 (age) years old
        //Set values for name and age
        student.setName("Alex");
        student.setAge(23);

        //Get and print the values of name and age
        System.out.println(student.getName() + " is " + student.getAge() + " years old.");
    }
}

class StudentDetails {

    //Encapsulated data
    private String name;
    private int age;

    //Encapsulate data
    //Getter for name
    public String getName() {
        return name;
    }

    //Setter for name
    public void setName(String name) {
        this.name = name;
    }

    //Getter for age
    public int getAge() {
        return age;
    }

    //Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}