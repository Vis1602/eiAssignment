package structural.decorator;

public class coffeeDemo {
    public static void main(String[] args) {
        // Simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Cost: Rs" + coffee.getCost());
        
        // Coffee with milk
        Coffee coffeeWithMilk = new MilkDecorator(coffee);
        System.out.println("\nOrder: " + coffeeWithMilk.getDescription());
        System.out.println("Cost: Rs" + coffeeWithMilk.getCost());
        
        // Coffee with milk and sugar
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("\nOrder: " + coffeeWithMilkAndSugar.getDescription());
        System.out.println("Cost: Rs" + coffeeWithMilkAndSugar.getCost());
        
        // Different combination - just sugar
        Coffee coffeeWithSugar = new SugarDecorator(new SimpleCoffee());
        System.out.println("\nOrder: " + coffeeWithSugar.getDescription());
        System.out.println("Cost: Rs" + coffeeWithSugar.getCost());
    }
} 