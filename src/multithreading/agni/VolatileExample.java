package multithreading.agni;

public class VolatileExample {
    static volatile boolean flag = true;
    public static void main(String[] args) {
    Thread thread = new Thread(()->{
        while (flag){
            System.out.println("Flag still is true");
        }
        System.out.println("Flag is false");
    });
    thread.start();
    flag = false;
        System.out.println("Flag is set to false");
    }

}
