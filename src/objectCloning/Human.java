package objectCloning;

public class Human implements Cloneable{
    int age;
    int name;
int []arr ;
    public Human(int age, int name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6};
    }

//    @Override
//    public Human clone() {
//        try {
//            // this is a shallow copy
//            Human clone = (Human) super.clone();
//
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }

    @Override
    public Human clone() {
        try {
            // this is a shallow copy
            Human clone = (Human) super.clone();
            clone.arr = new int[clone.arr.length];
            for (int c = 0; c <clone.arr.length ; c++) {
clone.arr[c] = this.arr[c];
            }
                       return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
