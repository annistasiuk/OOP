package PR_9;

public class Game {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Денус", 100);
        Priest priest = new Priest("Чіча", 80);
        Rogue rogue = new Rogue("Циган", 90);

        System.out.println("=== ВОЇН ===");
        warrior.attack();
        warrior.attack("меч");
        warrior.defend();
        warrior.defend("сталевий щит");
        warrior.specialAttack();

        System.out.println("\n=== ЖРЕЦЬ ===");
        priest.attack();
        priest.attack("жезл");
        priest.defend();
        priest.defend("магічний бар'єр");
        priest.specialAttack();

        System.out.println("\n=== ГРАБІЖНИК ===");
        rogue.attack();
        rogue.attack("ножик");
        rogue.defend();
        rogue.defend("ухилення");
        rogue.specialAttack();
    }
}
