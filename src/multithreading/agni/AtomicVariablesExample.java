package multithreading.agni;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariablesExample {
    public static void main(String[] args) throws InterruptedException {
        Example e = new Example();
        Thread thread = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                e.setCount();
                e.setCount1();
            }

        });
        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                e.setCount();
                e.setCount1();
            }

        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(e.count);
        System.out.println(e.count1);


    }
    public static class Example{
        int count = 0;
        AtomicInteger count1 = new AtomicInteger(0);


        void  setCount(){
            count = count+1;
        }
        void setCount1(){
            count1.incrementAndGet();
        }
    }
}
