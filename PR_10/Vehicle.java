package PR_10;

public abstract class Vehicle implements Controllable {
    protected String brand;
    protected String model;
    protected int maxSpeed;
    protected int capacity;

    public Vehicle(String brand, String model, int maxSpeed, int capacity) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public abstract void displayInfo();
    public abstract void currentSpeed(int speed);
    public abstract void displayCapacity();
}
