package Packages;

public class ShipCompartmentTest {
    static class Compartment {
        private double height;
        private double width;
        private double breadth;

        public Compartment(double height, double width, double breadth) {
            this.height = height;
            this.width = width;
            this.breadth = breadth;
        }

        public double getHeight() {
            return height;
        }

        public double getWidth() {
            return width;
        }

        public double getBreadth() {
            return breadth;
        }

        public double getVolume() {
            return height * width * breadth;
        }

        public void displayDetails() {
            System.out.println("Ship Compartment Dimensions:");
            System.out.println("Height: " + height + " meters");
            System.out.println("Width: " + width + " meters");
            System.out.println("Breadth: " + breadth + " meters");
            System.out.println("Volume: " + getVolume() + " cubic meters");
        }
    }

    public static void main(String[] args) {
        Compartment shipCompartment = new Compartment(8.5, 5.2, 3.0);
        shipCompartment.displayDetails();
    }
}