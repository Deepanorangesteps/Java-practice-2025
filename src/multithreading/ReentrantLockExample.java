package multithreading;

import java.util.concurrent.locks.ReentrantLock;

// 20-02-2026 see the dead lock example class to fix that issue we use this lock
// this lock provide more manual control like lock unlock timeout instead of doing the automatically like syncronised
public class ReentrantLockExample {
    class Counter{
        int count = 0;
        ReentrantLock lock1= new ReentrantLock();
        void increment(){
            lock1.lock();

            try {

                count++;
            }finally {
                lock1.unlock();
            }
        }
    }
}
