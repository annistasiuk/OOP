package PR_8;

public abstract class ZooEmployee {
    protected int id;
    protected String name;
    protected int experienceLevel;
    protected EmployeeRole role;

    public ZooEmployee(int id, String name, int experienceLevel, EmployeeRole role) {
        this.id = id;
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.role = role;
    }

    public void describeAnimal(Animal animal) {
        System.out.println("Працівник " + name + " описує тварину:\n" + animal.getFullInfo());
    }

    public void increaseExperience() {
        if (experienceLevel < 4) {
            experienceLevel++;
            System.out.println(name + " підвищив рівень досвіду до: " + experienceLevel);
        } else {
            System.out.println(name + " вже має максимальний рівень досвіду.");
        }
    }
}
