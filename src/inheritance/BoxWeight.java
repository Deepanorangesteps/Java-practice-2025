package inheritance;

public class BoxWeight  extends Box{

    double weight;

    public BoxWeight(double weight) {
        super();// this will call the parent class constructor then it will execute first only for example not able to put this line lastn
        System.out.println(super.h);// using super keyword we can access parent class variables also
        this.weight = weight;
        //super(); shows an error because it will execute first

    }
    public BoxWeight(BoxWeight others){
        super(others);
    }

    public BoxWeight() {

    }
}
