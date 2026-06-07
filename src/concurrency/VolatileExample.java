package concurrency;

public class VolatileExample {
    static volatile   boolean  flag = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            while (!flag){// if not volatile t1 not exit the loop it running
                System.out.println("running");
            }
            System.out.println("Flag changed");
        });

        Thread t2 = new Thread(() ->{
try {
    Thread.sleep(1000);
}catch (Exception e){
}
flag = true;
        });
        t1.start();
        t2.start();
    }
}
