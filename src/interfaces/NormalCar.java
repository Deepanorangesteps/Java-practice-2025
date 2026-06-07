package interfaces;

public class NormalCar implements Engine,Brake,SoundSystem{
    int a = 5;
    @Override
    public void brake() {
        System.out.println("brake in normal car");
    }

    // here start and stop methods are present in both interfaces Engine and Soundsystem
    // but interface does not really care about it, it check want to implement that method if present means no problem
    @Override
    public void start() {
        System.out.println("start using normal engine ");
    }

    @Override
    public void stop() {
        System.out.println("stop using a normal engine");
    }

    @Override
    public void acc() {
        System.out.println("Start like a normal car");
    }
}
