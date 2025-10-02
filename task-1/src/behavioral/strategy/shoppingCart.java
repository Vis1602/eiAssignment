package behavioral.strategy;

import java.util.logging.Logger;

import log.util.LoggerUtil;

public class shoppingCart {
    private static final Logger logger = LoggerUtil.getLogger();

    private paymentStrategy currentPaymentStrategy;

    public void setPaymentMethod(paymentStrategy strategy) {
        this.currentPaymentStrategy = strategy;
        logger.info("Payment method set to: " + strategy.getClass().getSimpleName());
    }

    public void checkout(int totalAmount) {
        if (currentPaymentStrategy == null) {
            logger.warning("Payment method not selected!");
            System.out.println("Payment method not selected!");
            return;
        }
        try {
            logger.info("Starting checkout with amount: " + totalAmount);
            currentPaymentStrategy.pay(totalAmount);
            logger.info("Checkout completed successfully.");
        } catch (Exception e) {
            logger.severe("Checkout failed: " + e.getMessage());
        }
    }
}
