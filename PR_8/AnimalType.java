package PR_8;

public enum AnimalType {
    PREDATOR("Хижак"),
    HERBIVORE("Травоїдна тварина");

    private final String displayName;

    AnimalType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
