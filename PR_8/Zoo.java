package PR_8;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<ZooEmployee> employees = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Додано тварину: " + animal.name);
    }

    public void addEmployee(ZooEmployee employee) {
        employees.add(employee);
        System.out.println("Додано працівника: " + employee.name);
    }

    public void upgradeEmployeeExperience(int id) {
        for (ZooEmployee emp : employees) {
            if (emp.id == id) {
                emp.increaseExperience();
                return;
            }
        }
        System.out.println("Працівника з ID " + id + " не знайдено.");
    }
}
