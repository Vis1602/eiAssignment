package behavioral.strategy;

public class upiPayment implements paymentStrategy {
    private String upiId;

    public upiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via UPI: " + upiId);
    }
}
