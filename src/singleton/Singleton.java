package singleton;
// 22-01-2026 its a normal class create single object
public class Singleton {
    // restrict to create multiple object so
    // make a constructor as a private why ?
    // because if we create an object using constructor only so we make it private
    private Singleton(){

    }
    private static Singleton instance; // does not dependent object so we declare static

    public static Singleton getInstance(){ // we can access this method using the class name
    if(instance == null){ // check object is created or not
        instance = new Singleton();// here constructor is private so here we create an object not able to create other file of this class
          // because constructor is private

    }
    return  instance;// hence we return the single object
    }
}
