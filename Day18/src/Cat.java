public class Cat {
    String name;
    String colour;
    String breed;

    Cat() {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
    }

    Cat(
            String name,
            String colour,
            String  breed) {
        this.name = name;
        this.colour = colour;
        this.breed  = breed;
    }

    static void callCat() {
        System.out.print("Meaw");
    }
}
