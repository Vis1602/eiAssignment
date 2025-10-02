package behavioral.observer;

public class stockMarketDemo {
    public static void main(String[] args) {
        stockMarket stockMarket = new stockMarket();
        stockTrader traderOne = new stockTrader("Vishal");
        stockTrader traderTwo = new stockTrader("Aaryan");
        stockTrader traderThree = new stockTrader("Bhavya");

        stockMarket.addObserver(traderOne);
        stockMarket.addObserver(traderTwo);
        stockMarket.addObserver(traderThree);

        System.out.println("Changing stock price Reliance....");
        stockMarket.setStockInfo("REL", 2000);

        System.out.println("Changing stock price Tata....");
        stockMarket.setStockInfo("TATA", 1000);

        System.out.println("Removing Trader Bhavya....");
        stockMarket.removeObserver(traderThree);

        System.out.println("Changing stock price Reliance....");
        stockMarket.setStockInfo("REL", 2500);
    }
}
