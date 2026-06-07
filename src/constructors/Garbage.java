package constructors;

public class Garbage {
    public static void main(String[] args) {
//     A obej ;
//        for (int i = 0; i <1000000000 ; i++) {
//            obej = new A("alex");
//        }
        System.out.println(3+6+"ksle");
        System.out.println("name" + 3 + 5);
    }
    static class A{
        String name;
        A(String name){
            this.name = name;
        }
// this method is automatically call when the garbage collector will delete the method it do
        // Garbage collector automatically delete the object
        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("object is destroyed");
        }
    }
}
