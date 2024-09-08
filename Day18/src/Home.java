public class Home {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.name = "kitty";
        c1.colour = "White";
        c1.breed = "persian";

        System.out.println(c1.name +" "+ c1.colour +" "+ c1.breed);

        Cat c2 = new Cat("Simba", "Black", "African");

        System.out.println(c2.name +" "+ c2.colour +" "+ c2.breed);

        Cat.callCat();
    }
}