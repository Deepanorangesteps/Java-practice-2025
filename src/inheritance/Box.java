package inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(Box box){
        this.l = box.l;
        this.h = box.h;
        this.w = box.w;
    }

}
