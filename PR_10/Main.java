package PR_10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mustang", 250, 4, 40);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 280, 2, 10);
        Plane plane = new Plane("Airbus", "A320", 850, 180);

        System.out.println("=== МАШИНА ===");
        car.displayInfo();
        car.currentSpeed(120);
        car.displayCapacity();
        car.start();
        car.startEngine();
        car.start();
        car.refuel(20);
        car.displayMaxDistance();
        car.stop();

        System.out.println("\n=== МОТОЦИКЛ ===");
        motorcycle.displayInfo();
        motorcycle.currentSpeed(100);
        motorcycle.displayCapacity();
        motorcycle.start();
        motorcycle.startEngine();
        motorcycle.start();
        motorcycle.refuel(5);
        motorcycle.displayMaxDistance();
        motorcycle.stop();

        System.out.println("\n=== ЛІТАК ===");
        plane.displayInfo();
        plane.currentSpeed(700);
        plane.displayCapacity();
        plane.takeOff();
        plane.land();
    }
}
