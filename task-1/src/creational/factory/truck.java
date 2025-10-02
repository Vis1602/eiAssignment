package creational.factory;

public class truck implements vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing a truck...");
    }
}
