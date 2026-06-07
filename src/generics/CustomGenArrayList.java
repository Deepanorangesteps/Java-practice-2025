package generics;

import java.util.Arrays;
// this is generics part 2 part 1 is customArrayList
// 03-02-2026 here we see the generics creating an cusotm array list using the generics
public class CustomGenArrayList<T> { // here T refers accept anything like Integer or String

    private Object[] data; // object is going to be any thing to create an object
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {

        this.data = new Object[DEFAULT_SIZE];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void add(T num){
        if(isFull()){
            reSize();
        }
        data[size++] =num;
    }

    private boolean isFull(){
        return size == data.length;

    }

    private void reSize(){
        Object[] temp = new Object[data.length *2];

        for (int i = 0; i <data.length ; i++) {
        temp[i] = data[i];
        }
        data = temp;
    }
public T removed(){
    return (T)(data[size--]);
}

public int size(){

        return size;
}
public T get(int index){
        return (T)(data[index]);
}
public void set(int index,T value){
          data[index]     = value;
}
    public static void main(String[] args) {
CustomGenArrayList<Integer> cs = new CustomGenArrayList(); // here based on the type we are adding the elements into the list
cs.add(5);
cs.add(7);
        System.out.println(cs.size);
        System.out.println(cs);
    }
}
