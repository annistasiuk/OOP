package PR_8;

public enum EmployeeRole {
    FEEDER("Годувальник"),
    CARETAKER("Доглядач");

    private final String displayName;

    EmployeeRole(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
