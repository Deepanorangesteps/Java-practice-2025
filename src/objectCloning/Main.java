package objectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human alex  = new Human(25,67);


        Human twin = alex.clone();// clone will copy the value from one to another object
        // this done by implement the clonable method in Human class
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 55;
        System.out.println(Arrays.toString(alex.arr)); // here we chane the array index 0 it will change main also becuase pointing to same
        // deep copy do not point to same one
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 55;
        System.out.println(Arrays.toString(alex.arr));
        //now it prints the same not change to 55

    }
}
