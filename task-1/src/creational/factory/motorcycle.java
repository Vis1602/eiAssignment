package creational.factory;

public class motorcycle implements vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a motorcycle...");
    }
}
