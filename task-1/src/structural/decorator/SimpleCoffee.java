package structural.decorator;

public class SimpleCoffee implements Coffee {
    private static final double BASE_COST = 20.0;
    
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
    
    @Override
    public double getCost() {
        return BASE_COST;
    }
} 