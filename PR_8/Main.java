package PR_8;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal lion = new Lion("Аслан", 5, 190.0, 50, "Прерія");
        Animal elephant = new Elephant("Елефантор", 10, 600.0, 70, "Савана");
        Animal monkey = new Monkey("Чіча", 3, 35.0, 30, "Джунглі");

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        Feeder feeder = new Feeder(1, "Денус", 2);
        Caretaker caretaker = new Caretaker(2, "Сеюріч", 3);

        zoo.addEmployee(feeder);
        zoo.addEmployee(caretaker);

        Food meat = new Food("Мʼясо", FoodType.MEAT, 40);
        Food grass = new Food("Трава", FoodType.PLANT, 30);

        feeder.feedAnimal(lion, meat);
        feeder.feedAnimal(elephant, meat); // відмова
        feeder.feedAnimal(monkey, grass);

        caretaker.trainAnimal(monkey);
        caretaker.trainAnimal(lion);

        feeder.describeAnimal(lion);
        caretaker.describeAnimal(elephant);

        zoo.upgradeEmployeeExperience(1);
    }
}
