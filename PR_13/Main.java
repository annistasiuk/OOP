package PR_13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Замовлення №1 ===");
        Order order1 = new Order(
                Arrays.asList("Кава", "Круасан"),
                115.0,
                new CardPayment(),
                new SmsNotification()
        );
        order1.processOrder();

        System.out.println("\n=== Замовлення №2 ===");
        Order order2 = new Order(
                Arrays.asList("Чай", "Сендвіч"),
                87.0,
                new CashPayment(),
                new EmailNotification()
        );
        order2.processOrder();

        System.out.println("\n=== Замовлення №3 ===");
        Order order3 = new Order(
                Arrays.asList("Сік", "Печиво", "Маффін"),
                134.5,
                new CardPayment(),
                new EmailNotification()
        );
        order3.processOrder();
    }
}
