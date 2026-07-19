package multithreading.agni;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // how to call the thread
/*        System.out.println("Main thread start");
        Thread1 thread1 =  new Thread1("Thread 1"); // we set Thread name like this
        // before start the thread we set as a Daemon
       // thread1.setDaemon(true);
        thread1.start();
        Thread thread2 = new
                Thread(new ThreadInterface(),"Thread 2");
        // the above line also we set the name
        thread2.start();
        System.out.println("Main thread ends ");

        // using the method reference we create a thread like this
        Thread thread3 = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 3:"+i);
            }
        });
        thread3.start(); */

        //synchronization
        Counter counter = new Counter();
        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
            //   counter.increment();
                counter.increment2();// synchronised method
            }
        });

        Thread thread2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
              //  counter.increment();
                counter.increment2();
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.count);
    }
}
