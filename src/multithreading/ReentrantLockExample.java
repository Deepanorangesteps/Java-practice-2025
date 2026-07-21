package multithreading;

import java.util.concurrent.locks.ReentrantLock;

// 20-02-2026 see the dead lock example class to fix that issue we use this lock
// this lock provide more manual control like lock unlock timeout instead of doing the automatically like syncronised
public class ReentrantLockExample {
    private static ReentrantLock lock = new ReentrantLock();
    public static  void  printNumbers(String threadName){
     lock.lock();
        try {
            System.out.println(threadName+" acquire the lock.");
            for (int i = 0; i < 5; i++) {
                System.out.println(threadName+" : "+i);
                Thread.sleep(1000);
            }
            System.out.println(threadName+"Complete the work.");
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
       lock.unlock();
            System.out.println(threadName+" released the lock.");
        }
    }
    public static void main(String[] args) {
        // simple example how to implement the lock
      /*  Thread thread = new Thread(()->printNumbers("Thread-1"));
        Thread thread1 = new Thread(()->printNumbers("Thread-2"));
        thread.start();
        thread1.start();*/

        // try lock example
        Thread thread = new Thread(()->work("Thread-1"));
        Thread thread1 = new Thread(()->work("Thread-2"));
       // thread.start();
       // thread1.start();
        methodA();

    }

    public static void methodA(){
        lock.lock();
        try {
            System.out.println("Inside method A");
            methodB();
        }finally {
            lock.unlock();
        }
/*methodA()
↓
lock.lock()
↓
Lock Count = 1
↓
Calls methodB()
↓
lock.lock()
↓
Lock Count = 2
↓
methodB finishes
↓
unlock()
↓
Lock Count = 1
↓
methodA finishes
↓
unlock()
↓
Lock Count = 0*/
    }
    public static void methodB(){
        lock.lock();
        try {
            System.out.println("Inside the method B");
        }finally {
           lock.unlock();
        }
    }

    public static void work(String threadName){
        if(lock.tryLock()){
            try {
                System.out.println(threadName +" got the lock");
                Thread.sleep(5000);
                System.out.println(threadName+" finished.");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }finally {
                lock.unlock();
            }
        }else{
            System.out.println(threadName+" could not get the lock.");
        }
    }
}
