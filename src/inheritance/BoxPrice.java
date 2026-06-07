package inheritance;

public class BoxPrice extends BoxWeight{
    public BoxPrice(double weight) {
        super(weight);
    }

    public BoxPrice(BoxWeight others) {
        super(others);
    }

    public BoxPrice() {
        super();
    }

    public static void main(String[] args) {
        BoxPrice bp = new BoxPrice();

    }
}
