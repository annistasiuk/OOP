package PR_8;

public class Feeder extends ZooEmployee {
    public Feeder(int id, String name, int experienceLevel) {
        super(id, name, experienceLevel, EmployeeRole.FEEDER);
    }

    public void feedAnimal(Animal animal, Food food) {
        if (animal.type == AnimalType.PREDATOR && experienceLevel < 2) {
            System.out.println("Працівник " + name + " не має доступу до хижаків.");
            return;
        }
        System.out.println(name + " годує " + animal.name + " їжею: " + food.getName());
        animal.feed(food);
    }
}
