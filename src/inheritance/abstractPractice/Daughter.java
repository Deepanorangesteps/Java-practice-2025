package inheritance.abstractPractice;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am a doctor");
    }

    @Override
    void education() {
        System.out.println("studying a MBBS");
    }
}
