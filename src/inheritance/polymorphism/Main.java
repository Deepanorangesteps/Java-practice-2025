package inheritance.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();

        // type of the reference variable is parent class but the object of the type is sub class new Circle();
        Shapes circle = new Circle();
        circle.area();// which method will call should be based on the object right hand side new Circle()

        Shapes shape1 = new Circle();
        shape1.greeting();// here this greeting is static we can inheritate but can't override
    }

}
