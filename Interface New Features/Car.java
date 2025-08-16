public class Car implements Vehicle, FourWheeler {
    public void message() {
        Vehicle.super.message();
    }    public static void main(String[] args) {
        Car car = new Car();
        car.message();
    }
}
