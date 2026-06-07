package staticexample;

public class Main {
    public static void main(String[] args) {
        // refer the parent class
        // in static first execute the static variable then parent static block then child static block
        Child c = new Child();
        Parent p = new Child();
        Child child = (Child) p;

    }
}
