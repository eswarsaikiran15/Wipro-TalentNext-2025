public interface Vehicle {
    default void message() {
        System.out.println("This is a vehicle");
    }
}