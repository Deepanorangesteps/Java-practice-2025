package staticexample;

public class Child extends Parent{
    static {
        System.out.println("child static block");
    }
    {
        System.out.println("child instance block");
    }
    public Child(){
      //  super("PArent");
this("parent");
        System.out.println("child cons");

    }
    public Child(String name){
        System.out.println("Name "+name);
    }
    void show(){
        System.out.println("am a child show");
    }

}
