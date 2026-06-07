package staticexample;

public class Parent {
    static int a = printA();
            static int printA(){
                System.out.println("parent static variable");
        return 5;
            }
    static {
        System.out.println("parent static block");
    }
    {
        System.out.println("parent instance block");
    }
    public Parent(){

    }
   void show(){
       System.out.println("am i parent show");
   }
}
