package functions;
// 17-12-2025
public class Shadowing {
    /*SHADOWING IS using two variable with same name within the scope that overlaps*/
    static int x = 40;
    public static void main(String[] args) {
        System.out.println(x);
     int x ; // lower level overloaded the upper level variable
        //System.out.println(x); scope will begin when the value is initialised
        x = 90;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
