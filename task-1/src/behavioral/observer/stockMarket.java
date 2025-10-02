package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import log.util.LoggerUtil;

public class stockMarket {
    private static final Logger logger = LoggerUtil.getLogger();

    private List<stockObserver> observers = new ArrayList<>();
    private String stockSymbol;
    private double stockPrice;

    public void addObserver(stockObserver observer) {
        observers.add(observer);
        logger.info("Observer added: " + observer);
    }

    public void removeObserver(stockObserver observer) {
        observers.remove(observer);
        logger.info("Observer removed: " + observer);
    }

    public void setStockInfo(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        logger.info("Stock info updated: Symbol=" + stockSymbol + ", Price=" + stockPrice);
        notifyObservers();
    }

    private void notifyObservers() {
        logger.info("Notifying observers...");
        for (stockObserver observer : observers) {
            try {
                observer.update(stockSymbol, stockPrice);
                logger.info("Notified observer: " + observer);
            } catch (Exception e) {
                logger.severe("Failed to notify observer: " + observer + ". Error: " + e.getMessage());
            }
        }
    }
}
