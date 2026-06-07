package inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight box = new BoxWeight(5.9);// here if we call this we can call the parent constructor because we declared as a private
        System.out.println(box.l);

        //this below object reference the boxType and creating an obj Boxweight
        // here we can access variables using box1 present only Box not BoxWeight
        Box box1 = new BoxWeight(5.9);// we can create a object like this
        System.out.println(box1.w);


        // 2
        // here we have many variable in both parent and child class
        // we have access to BoxWeight class variables
        // but here where the obj itself its of type of parent class how will you call the constructor
        //BoxWeight box2 = new Box();// this one is not allowed


    }
}
