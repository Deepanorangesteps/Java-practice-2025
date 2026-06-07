package constructors;

public class Wrapper {
    public static void main(String[] args) {
        Integer a= 50;
        Integer b = 60;
        // using wrapper class we can perform and use several methods using the functions and properties

        int i = 5;
        int j = 6;
        swap(i,j);
        System.out.println(i+" "+j);// so if we swap in function primitive are not change because
        // it is pass by value not reference
        // but in wrapper class is a class consider as a object
        swap(a,b);
        System.out.println(a+" "+b);// this also cannot be change origin value because wrapper class is final
        // if we click the INTEGER is declare as final so we cannot change the origin value
    }
    // BUT OBJECTS LIKE array are change in the origin value if we change in function or any where because it is pass by reference
   static void swap(int a,int b){
      int temp = a;
      a = b;
      b = temp;
    }
    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
