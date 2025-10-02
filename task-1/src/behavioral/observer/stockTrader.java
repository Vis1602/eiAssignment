package behavioral.observer;

public class stockTrader implements stockObserver {
    private String traderName;

    public stockTrader(String traderName) {
        this.traderName = traderName;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println(traderName + " got update: " + stockSymbol + " is for " + stockPrice);
    }
}
