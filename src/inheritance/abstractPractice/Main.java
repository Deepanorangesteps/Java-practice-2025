package inheritance.abstractPractice;

public class Main {
    public static void main(String[] args) {
        Parent p = new Son(28);
        p.career();
        int age =p.age;
        p.decidePayment();
        p.normal();
        Son s = new Son(24);
        s.normal();
        System.out.println(s.age+" son age");

    }
}
