package exceptionHandling;
// 07-02-2026 exception handling and try catch details then creating an own exception class
public class Main {
    public static void main(String[] args) {
        int a =5;
        int b = 0;
        try {
           // divide(a,b);
            String name = "alex";
            if(name.equals("alex")){
                throw new MyException("calling an own exception");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always execute");
        }

    }

   static int divide(int a,int b) throws ArithmeticException{
        if(a==0 ||  b==0){
            throw  new ArithmeticException("Do not divide by zero");
        }
        return a/b;
    }
}
