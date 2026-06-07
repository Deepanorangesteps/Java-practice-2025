package inheritance.polymorphism;
// 28-01-2025 method overloading
public class Numbers {

    double sum(double a,int b){
        return a+b;
    }
//    int sum(int a,int b){
//        return a+b;
//    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(4,5);//calling sum it will call first one when second sum is not present it will acept and
        // here happens automatic type promotion int will converted into double and return it but in the int we can't pass double
    }
}
