package recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {

    }
    static void print(int n){
        // base condition
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // this is recursive call function calling itself
        //if you are calling a function again and again you can treat as a spearate call in stack 
        print(n+1);
    }
}
