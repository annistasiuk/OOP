package PR_13;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата карткою: " + amount + " грн");
    }
}
