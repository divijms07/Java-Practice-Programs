//class with motive of learning objects & methods
class Box {
    double width;
    double height;
    double depth;
    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    void volume() {
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
    double computeVolume() {
        return width * height * depth;
    }
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
// This class declares an object of type Box.
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);
    }
}








