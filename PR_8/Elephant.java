package PR_8;

public class Elephant extends Animal {
    public Elephant(String name, int age, double weight, int hungerLevel, String location) {
        super(name, AnimalType.HERBIVORE, age, weight, hungerLevel, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " трубить!");
    }

    @Override
    public void move() {
        System.out.println(name + " повільно йде.");
    }
}
