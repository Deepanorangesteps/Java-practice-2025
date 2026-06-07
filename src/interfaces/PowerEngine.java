package interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("starting the power engine");
    }

    @Override
    public void stop() {
        System.out.println("stops the power engine");
    }

    @Override
    public void acc() {
        System.out.println("accelerate the power engine");
    }
}
