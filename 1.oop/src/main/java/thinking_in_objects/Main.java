package thinking_in_objects;

public class Main {
    public static void main(String[] args) {
        Tneb tneb = new Tneb();

        Toaster toaster = new Toaster();

        tneb.givePower(toaster);
    }
}