package creational.factory;

public class vehicleManufacturingDemo {
    public static void main(String[] args) {
        vehicleFactory factory = new vehicleFactory();

        vehicle myCar = factory.createVehicle("car");
        myCar.manufacture();

        vehicle myMotorcycle = factory.createVehicle("motorcycle");
        myMotorcycle.manufacture();

        vehicle myTruck = factory.createVehicle("truck");
        myTruck.manufacture();
    }
}
