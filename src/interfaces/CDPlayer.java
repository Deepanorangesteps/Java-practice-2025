package interfaces;

public class CDPlayer implements SoundSystem{
    @Override
    public void start() {
        System.out.println("Starts the music player");
    }

    @Override
    public void stop() {
        System.out.println("Stops the music player");
    }
}
