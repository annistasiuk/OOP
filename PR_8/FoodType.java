package PR_8;

public enum FoodType {
    MEAT("Мʼясо"),
    PLANT("Рослинна їжа");

    private final String displayName;

    FoodType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
