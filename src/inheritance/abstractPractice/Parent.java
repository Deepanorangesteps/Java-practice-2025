package inheritance.abstractPractice;
// abstract class 01-02-2026
public abstract class Parent {
    int age;
// abstract class if one or more method is abstract means declare a class as a abstract
    // abstract class contains a variables methods with body like as a normal method
    // we can't create an object for this abstract class


    public Parent(int age) {
        this.age = age;
    }

    abstract void career();
   abstract void education();

   void normal(){
        System.out.println(" i am a normal method");
    }
    final void decidePayment(){

    }
}
