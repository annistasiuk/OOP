package PR_8;

public class Monkey extends Animal {
    private boolean isClimbing = false;

    public Monkey(String name, int age, double weight, int hungerLevel, String location) {
        super(name, AnimalType.HERBIVORE, age, weight, hungerLevel, location);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " кричить: У-У-А-А!");
    }

    @Override
    public void move() {
        isClimbing = !isClimbing;
        System.out.println(name + (isClimbing ? " лазить по деревах." : " стрибає по землі."));
    }
}
