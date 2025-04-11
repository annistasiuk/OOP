package PR_9;

public class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void defend() {
        System.out.println(name + " захищається без щита");
    }

    public void defend(String shieldType) {
        System.out.println(name + " захищається з використанням щита: " + shieldType);
    }

    public void attack() {
        System.out.println(name + " атакує без зброї");
    }

    public void attack(String weapon) {
        System.out.println(name + " атакує зброєю: " + weapon);
    }

    public void specialAttack() {
        System.out.println(name + " виконує стандартну спеціальну атаку");
    }
}
