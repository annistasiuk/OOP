package PR_13;

import java.util.List;

public class Order {
    private List<String> items;
    private double totalAmount;
    private PaymentMethod paymentMethod;
    private Notification notification;

    public Order(List<String> items, double totalAmount, PaymentMethod paymentMethod, Notification notification) {
        this.items = items;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.notification = notification;
    }

    public void processOrder() {
        System.out.println("🧾 Товари до замовлення: " + items);
        System.out.println("💵 Загальна сума: " + totalAmount + " грн");
        paymentMethod.pay(totalAmount);
        notification.send("Ваше замовлення оброблено.");
    }
}

