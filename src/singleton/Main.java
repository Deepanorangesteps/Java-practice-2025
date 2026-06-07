package singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 =Singleton.getInstance(); // here we create a first object

        Singleton obj2 = Singleton.getInstance(); // here return the same object which is already created previously


    }
}
