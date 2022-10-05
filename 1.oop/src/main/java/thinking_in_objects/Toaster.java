package thinking_in_objects;

public class Toaster implements ISocket{

    public void plug(String power) {
        System.out.println("power = " + power);
    }

    public Boolean isPlugged() {
        return true;
    }
}
