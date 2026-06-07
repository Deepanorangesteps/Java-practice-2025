package interfaces;

public class NiceCar {
    private Engine engine;
    private SoundSystem musicPlayer = new CDPlayer();

    public NiceCar() {
        this.engine = new PowerEngine();
    }

    public void startEngine(){
        engine.start();
    }
    public void StopEngine(){
        engine.stop();
    }

    public void startMusic(){
        musicPlayer.start();
    }
    public void stopMusic(){
        musicPlayer.stop();
    }
}
