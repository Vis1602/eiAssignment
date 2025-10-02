package behavioral.strategy;

public class shoppingCartDemo {
    public static void main(String[] args) {
        shoppingCart myCart = new shoppingCart();

        // Using UPI payment
        paymentStrategy upiPay = new upiPayment("vishal@upi");
        myCart.setPaymentMethod(upiPay);
        System.out.println("Checking out with UPI...");
        myCart.checkout(500);

        // Switching to Credit Card
        paymentStrategy cardPay = new cardPayment("12345678");
        myCart.setPaymentMethod(cardPay);
        System.out.println("Checking out with card...");
        myCart.checkout(250);
    }
}
