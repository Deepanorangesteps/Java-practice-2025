package interfaces.nestedinterfaces;

public class A {
    // nested interfaces
// for this nested interface we can declare public protected or Private as well
    // this access should applicable only this one
    public interface NestedInterface{

        boolean isOdd(int num);
    }
}
class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
