package PR_8;

public class Lion extends Animal {
    public Lion(String name, int age, double weight, int hungerLevel, String location) {
        super(name, AnimalType.PREDATOR, age, weight, hungerLevel, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " гарчить!");
    }

    @Override
    public void move() {
        System.out.println(name + " бігає по території.");
    }
}
