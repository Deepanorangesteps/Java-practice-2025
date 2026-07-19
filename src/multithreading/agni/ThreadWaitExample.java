package multithreading.agni;

public class ThreadWaitExample {
    static Object lock = new Object();
    // lock wait means it will put wait the thread
    // lock.notify means once the thread is completed it will
    // give notification to the waiting thread i am completed now you will be proceed
    public static void main(String[] args) {
        Thread thread1 = new Thread(
                ()->{
                    synchronized (lock){
                        try {
                            System.out.println("Thread 1 is waiting");
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("thread one is completed");
                    }
                }
        );

        Thread thread2 = new Thread(()->{
            synchronized (lock){
                System.out.println("Thread 2 is waiting");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 is started");
            }
        });
        thread1.start();
        thread2.start();
        synchronized (lock){
            System.out.println("Main thread is completed");
            lock.notifyAll();
        }
    }


}
