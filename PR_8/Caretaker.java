package PR_8;

public class Caretaker extends ZooEmployee {
    public Caretaker(int id, String name, int experienceLevel) {
        super(id, name, experienceLevel, EmployeeRole.CARETAKER);
    }

    public void trainAnimal(Animal animal) {
        System.out.println(name + " тренує " + animal.name + ":");
        animal.makeSound();
        animal.move();
    }
}
