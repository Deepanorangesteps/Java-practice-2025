package inheritance.abstractPractice;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i am a coder");
    }

    @Override
    void education() {
        System.out.println("studying a Computer science");
    }
}
