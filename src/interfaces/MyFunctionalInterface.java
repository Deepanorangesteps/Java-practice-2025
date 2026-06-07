package interfaces;
// so this is a functional interface here we can declare only one abstract method
/*Only one abstract method
Can have multiple default/static methods
Used in Lambda expressions*/
@FunctionalInterface
public interface MyFunctionalInterface {
    void show();
 default void test(){
     System.out.println("nne");
 }
 default void test3(){
     System.out.println("Hii");
 }
}
