package comparingobjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student alex  = new Student(22,87.98f);
        Student micheal  = new Student(56,77.85f);
        Student Robert  = new Student(49,89.7f);
        Student david  = new Student(37,99.9f);
        Student[] list = {alex,micheal,Robert,david};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list); // here inside this sort we have the compare to method 
        System.out.println(Arrays.toString(list));
//        if(alex.compareTo(micheal) <0){
//            System.out.println("Micheal has more marks");
//        }
    }
}
