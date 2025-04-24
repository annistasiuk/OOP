package PR_13;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата готівкою: " + amount + " грн");
    }
}
