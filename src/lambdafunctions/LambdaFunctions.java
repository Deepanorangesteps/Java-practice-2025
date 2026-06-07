package lambdafunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);

        // lambda for each function
        arr.forEach((item) -> System.out.println(item*2));
        //or we can use below method as well using consumer
        Consumer<Integer> con =   (item) -> System.out.println(item*2);
        arr.forEach(con);
        Operation sum = (a,b) -> a+b;
        Operation sub = (a,b) -> a-b ;// so here we are implementing an interface Operation declared below
        LambdaFunctions lf = new LambdaFunctions();
        System.out.println(lf.operate(5,15,sum));

    }
    private int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }
}

interface  Operation{
    int operation(int a, int b);
}