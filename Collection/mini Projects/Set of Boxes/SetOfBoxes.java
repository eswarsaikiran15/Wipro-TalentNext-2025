import java.util.*;

class Box {
    private double length;
    private double width;
    private double height;
    private double volume;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.volume = length * width * height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Box) {
            Box other = (Box) obj;
            return Double.compare(this.volume, other.volume) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Double.valueOf(volume).hashCode();
    }
}

public class SetOfBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Box> boxSet = new LinkedHashSet<>();

        System.out.print("Enter the number of Box:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Box " + i + " details");
            System.out.print("Enter Length:");
            double length = sc.nextDouble();
            System.out.print("Enter Width:");
            double width = sc.nextDouble();
            System.out.print("Enter Height:");
            double height = sc.nextDouble();

            Box box = new Box(length, width, height);
            boxSet.add(box);
        }

        System.out.println("Unique Boxes in the Set are");
        for (Box b : boxSet) {
            System.out.printf("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f\n",
                b.getLength(), b.getWidth(), b.getHeight(), b.getVolume());
        }
    }
}
