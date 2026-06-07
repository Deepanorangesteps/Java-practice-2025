package interfaces.extendinterfaces2.extendinterfaces;

public interface A {

    // from java  8 we create a default method that would have body
//    default void gret(){
//        System.out.println("default method");
//    }

    // then here we create a static methods and it does have a body
    static void greet(){
        System.out.println("Hello i am from static ");
    }
    void fun();
}
