package PR_10;

public class Plane extends Vehicle {
    public Plane(String brand, String model, int maxSpeed, int capacity) {
        super(brand, model, maxSpeed, capacity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Літак: " + brand + " " + model + " Макс. швидкість: " + maxSpeed + " км/год");
    }

    @Override
    public void currentSpeed(int speed) {
        System.out.println("Поточна швидкість літака: " + speed + " км/год");
    }

    @Override
    public void displayCapacity() {
        System.out.println("Місткість літака: " + capacity + " пасажирів");
    }

    @Override
    public void start() {
        System.out.println("Літак злітає.");
    }

    @Override
    public void stop() {
        System.out.println("Літак приземлився.");
    }

    public void takeOff() {
        System.out.println("Літак взяв курс на зліт.");
    }

    public void land() {
        System.out.println("Літак приземлюється.");
    }
}
