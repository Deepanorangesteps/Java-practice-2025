package interfaces;
// interfaces 01-02-2026
public interface Engine {
    /*NOTE
    * not to use this interface in performance critical code because it happens at runtime */
    static final int PRICE = 5000;

    void start();
    void stop();
    void acc();
}
