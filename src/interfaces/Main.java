package interfaces;

public class Main {
    public static void main(String[] args) {
        Engine obj = new NormalCar();
        // the above obj the left hand side is which type and decide what are the access
        // on the right side which one want to access should be decided
        // so obj.a here a is in NormalCar so upward Engine not have an knowledge above Normalcar class so unable to access
        // we access only method which is present in the engine interface or class in inheritance

        SoundSystem ss = new NormalCar();
        ss.start();// here i call start it does not call or declared soundsytem start so it's conflict calling the engine start method because both Engine and soundsytem
        // interface contains start method due to this we create a separate class and call it refer the Nice car class
    NiceCar niceCar = new NiceCar();
    niceCar.startEngine();
    niceCar.startMusic();// here we create a separate class for engine music and call it
    }
}
