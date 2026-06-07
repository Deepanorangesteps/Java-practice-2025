package defaultobjectmethods;

import java.lang.ref.Cleaner;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

//30-01-2026 object class
public class ObjectDemo {
// every class extending an object class internally

    int a = 5;
    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

    public ObjectDemo(int a) {
        this.a = a;
    }

    // this method call automatically during the garbage collection refer constructor package
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // it gives the number representation of an object
    // has code means unique representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo o = new ObjectDemo(45);
        ObjectDemo o1 = new ObjectDemo(33);
        System.out.println(o.hashCode());// here we can see the unique hashcode value
        System.out.println(o1.hashCode());// it gives an random integer value not an address
        System.out.println(o instanceof Object);// here we check this is the instance of the object wheather it extends an object class or not

        System.out.println(o.getClass());// here in get class details are stored in heap memory
    }
}
