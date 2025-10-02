import behavioral.observer.stockMarketDemo;
import behavioral.strategy.shoppingCartDemo;
import creational.factory.vehicleManufacturingDemo;
import creational.singleton.singletonDemo;
import structural.adapter.mediaPlayerDemo;
import structural.decorator.coffeeDemo;
import task2.Main;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect a functionality to run:");
            System.out.println("1. Observer Pattern");
            System.out.println("2. Strategy Pattern");
            System.out.println("3. Factory Pattern");
            System.out.println("4. Singleton Pattern");
            System.out.println("5. Adapter Pattern");
            System.out.println("6. Decorator Pattern");
            System.out.println("7. Mars Rover");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Running Observer Pattern Demo...");
                    stockMarketDemo.main(null);
                    break;
                case 2:
                    System.out.println("Running Strategy Pattern Demo...");
                    shoppingCartDemo.main(null);
                    break;
                case 3:
                    System.out.println("Running Factory Pattern Demo...");
                    vehicleManufacturingDemo.main(null);
                    break;
                case 4:
                    System.out.println("Running Singleton Pattern Demo...");
                    singletonDemo.main(null);
                    break;
                case 5:
                    System.out.println("Running Adapter Pattern Demo...");
                    mediaPlayerDemo.main(null);
                    break;
                case 6:
                    System.out.println("Running Decorator Pattern Demo...");
                    coffeeDemo.main(null);
                    break;
                case 7:
                    System.out.println("Running Mars Rover Demo...");
                    Main.main(null);
                    break;
                case 8:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);

        scanner.close();
    }
}