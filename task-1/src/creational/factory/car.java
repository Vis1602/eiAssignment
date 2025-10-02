package creational.factory;

public class car implements vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a car...");
    }
}
