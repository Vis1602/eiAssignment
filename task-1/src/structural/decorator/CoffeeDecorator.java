package structural.decorator;

import java.util.logging.Logger;

import log.util.LoggerUtil;

public abstract class CoffeeDecorator implements Coffee {
    private static final Logger logger = LoggerUtil.getLogger();

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
        logger.info("CoffeeDecorator initialized with: " + coffee.getClass().getSimpleName());
    }

    @Override
    public String getDescription() {
        logger.fine("Getting description from decorated coffee.");
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        double cost = coffee.getCost();
        logger.fine("Getting cost from decorated coffee: " + cost);
        return validateCost(cost);
    }

    protected double validateCost(double cost) {
        if (cost < 0) {
            logger.warning("Invalid cost detected: " + cost);
            throw new IllegalArgumentException("Cost cannot be negative: " + cost);
        }
        return cost;
    }
}