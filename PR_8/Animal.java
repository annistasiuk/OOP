package PR_8;

public abstract class Animal {
    protected String name;
    protected AnimalType type;
    protected int age;
    protected double weight;
    protected int hungerLevel;
    protected String location;

    public Animal(String name, AnimalType type, int age, double weight, int hungerLevel, String location) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.weight = weight;
        this.hungerLevel = hungerLevel;
        this.location = location;
    }

    public abstract void makeSound();
    public abstract void move();

    public void feed(Food food) {
        if (type == AnimalType.HERBIVORE && food.getType() == FoodType.MEAT) {
            System.out.println(name + " відмовляється їсти м'ясо!");
        } else {
            hungerLevel = Math.max(0, hungerLevel - food.getNutrition());
            System.out.println(name + " їсть " + food.getName() + " і тепер рівень голоду: " + hungerLevel);
        }
    }

    public String getFullInfo() {
        return "Тварина: " + name + ", Вид: " + type + ", Вік: " + age + ", Вага: " + weight +
                ", Рівень голоду: " + hungerLevel + ", Місце: " + location;
    }
}
