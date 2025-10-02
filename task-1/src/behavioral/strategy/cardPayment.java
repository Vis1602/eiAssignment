package behavioral.strategy;

public class cardPayment implements paymentStrategy {
    private String cardNumber;

    public cardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via card: " + cardNumber);
    }
}
