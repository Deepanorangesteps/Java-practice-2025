package multithreading.agni;

public class ThreadLifeCycleExample {
    public static void main(String[] args) throws InterruptedException {
        // New state
        Thread thread1 =new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("I am from thread 1");
            }
        });

        Thread thread2 =new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("I am from thread 2");
            }
        });

        thread1.start();// runnable state it's going to be run or start running

        // blocked state
        //  so here in this synchronised method it will block the thread to access
//        synchronized void add{
//
//        }

        // waiting state
        // is achieved using two join and wait
      //  thread1.join();// this join tells other thread
        // wait first i will finish my work then other thread will do after my work complete
        thread2.start();
        //we can set the wait and Thread.sleep();
       //  thread1.wait(200);
    }
}
