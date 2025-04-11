package PR_10;

public class Car extends Vehicle implements FuelPowered {
    private double fuelLevel;
    private boolean engineStarted = false;

    public Car(String brand, String model, int maxSpeed, int capacity, double fuelLevel) {
        super(brand, model, maxSpeed, capacity);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Машина: " + brand + " " + model + " Макс. швидкість: " + maxSpeed + " км/год");
    }

    @Override
    public void currentSpeed(int speed) {
        System.out.println("Поточна швидкість машини: " + speed + " км/год");
    }

    @Override
    public void displayCapacity() {
        System.out.println("Місткість машини: " + capacity + " пасажирів");
    }

    @Override
    public void start() {
        if (engineStarted) {
            System.out.println("Машина рушає");
        } else {
            System.out.println("Не можна рушити без запуску двигуна");
        }
    }

    @Override
    public void stop() {
        System.out.println("Машина зупинилась.");
    }

    @Override
    public void startEngine() {
        System.out.println("Двигун машини запущено.");
        engineStarted = true;
    }

    @Override
    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println("Машину заправлено на " + liters + " літрів. Поточний рівень палива: " + fuelLevel);
    }

    @Override
    public void displayMaxDistance() {
        System.out.println("Максимальна дальність машини: " + (fuelLevel * 10) + " км");
    }
}

