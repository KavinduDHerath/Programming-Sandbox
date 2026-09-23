public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Tommy" , "Labrador");
        Dog dog2 = new Dog("Bella" , "German Shepherd");

        System.out.println("This is " + dog1.name + ". It is a " + dog1.breed + ". 🐕");
        System.out.println("This is " + dog2.name + ". It is a " + dog2.breed + ". 🐶");
        System.out.println();

        dog1.setName("Toby");
        dog1.setBreed("Lion Shepherd");

        dog2.setName("Laika");
        dog2.setBreed("Stray Mongrel");

        System.out.println("Set new Name & Breed");
        System.out.println("Now this is " + dog1.getName() + ". It is a " + dog1.getBreed() + ". 🐕🦁");
        System.out.println("Now this is " + dog2.getName() + ". It is a " + dog2.getBreed() + " which flew to space. 🐶🚀");

    }

}
