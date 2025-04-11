package PR_10;

public class Motorcycle extends Vehicle implements FuelPowered {
    private double fuelLevel;
    private boolean engineStarted = false;

    public Motorcycle(String brand, String model, int maxSpeed, int capacity, double fuelLevel) {
        super(brand, model, maxSpeed, capacity);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Мотоцикл: " + brand + " " + model + " Макс. швидкість: " + maxSpeed + " км/год");
    }

    @Override
    public void currentSpeed(int speed) {
        System.out.println("Поточна швидкість мотоцикла: " + speed + " км/год");
    }

    @Override
    public void displayCapacity() {
        System.out.println("Місткість мотоцикла: " + capacity + " особи");
    }

    @Override
    public void start() {
        if (engineStarted) {
            System.out.println("Мотоцикл рушає");
        } else {
            System.out.println("Не можна рушити без запуску двигуна");
        }
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл зупинився.");
    }

    @Override
    public void startEngine() {
        System.out.println("Двигун мотоцикла запущено.");
        engineStarted = true;
    }

    @Override
    public void refuel(double liters) {
        fuelLevel += liters;
        System.out.println("Мотоцикл заправлено на " + liters + " літрів. Поточний рівень палива: " + fuelLevel);
    }

    @Override
    public void displayMaxDistance() {
        System.out.println("Максимальна дальність мотоцикла: " + (fuelLevel * 20) + " км");
    }
}
