package ClassesAndObjects;

public class Box {
    double width, height, depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box myBox = new Box(5.0, 3.0, 2.0);
        System.out.println("Volume of the box is: " + myBox.getVolume());
    }
}