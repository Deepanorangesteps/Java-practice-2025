package concurrency;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();

        Counter c2= new Counter();

        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 10; i++) {
                c.increment2();
                System.out.println("thread 1 ->"+c.count);
            }
        }
                );

        Thread t2 = new Thread(()->
        {
            for (int i = 0; i < 10; i++) {
                c.increment2();
                System.out.println("thred 2 ->"+c2.count);
            }
        });
        t1.start();
        t2.start();
    }
}
