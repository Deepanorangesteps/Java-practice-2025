package inheritance.polymorphism;

import inheritance.polymorphism.Shapes;

public class Circle extends Shapes {
    @Override
    void area(){
        System.out.println("Area of circle is pi * r*r");
    }
    void circleSpecial(){
        System.out.println("ggg");
    }
}
