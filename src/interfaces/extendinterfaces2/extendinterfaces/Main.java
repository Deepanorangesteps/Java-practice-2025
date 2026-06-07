package interfaces.extendinterfaces2.extendinterfaces;

public class Main implements A,B {

    @Override
    public void fun() {

    }

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        A.greet();// static method call using the class/interface name
    }
}
