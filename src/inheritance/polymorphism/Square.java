package inheritance.polymorphism;

public class Square extends Shapes{

    // this will run when the object of the circle is created
    // hence it overriding the parent method
    //@Override
    void area() {
        System.out.println("Area of the square is sides ");
    }
}
