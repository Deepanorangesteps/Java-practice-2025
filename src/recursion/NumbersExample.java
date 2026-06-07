package recursion;
// 10-02-2026 RECURSION what is recursion
// PROGRAM NO 1
public class NumbersExample {
    public static void main(String[] args) {
print1(1); // here see the method body and paramaner are same and doing same work but we are
        // calling single time inside that calling same work at different time refer notes as well

    }
    static void print1(int n){
        System.out.println(n);
        print2(2);
    }
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
        System.out.println(n);
        print4(4);
    }
    static void print4(int n){
        System.out.println(n);
        print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}




