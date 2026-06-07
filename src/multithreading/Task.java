package multithreading;

public class Task implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Task(),"Thread-1");
        Thread t2 = new Thread(new Task(),"Thread-2");
       // t2.start();
       // t1.start();
Thread t  =new Thread(()->{
    for (int i = 0; i < 5; i++) {
        System.out.println("child thread "+i);
    }
});
        t.start();
       // t.join();  // main waits

        System.out.println("Main thread resumes");
    }
    void joinThread(){

    }
}
