package Packages;

public class VehicleTest {
    static abstract class Vehicle {
        public abstract String getModelName();
        public abstract String getRegistrationNumber();
        public abstract String getOwnerName();
    }
    static class Hero extends Vehicle {
        private String modelName;
        private String registrationNumber;
        private String ownerName;
        private int speed;

        public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() {
            return modelName;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public int getSpeed() {
            return speed;
        }

        public void radio() {
            System.out.println("Hero Radio: Playing FM music...");
        }
    }
    static class Honda extends Vehicle {
        private String modelName;
        private String registrationNumber;
        private String ownerName;
        private int speed;

        public Honda(String modelName, String registrationNumber, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() {
            return modelName;
        }

        public String getRegistrationNumber() {
            return registrationNumber;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public int getSpeed() {
            return speed;
        }

        public void cdplayer() {
            System.out.println("Honda CD Player: Playing audio CD...");
        }
    }

    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "HR26AB1234", "Rajesh", 60);
        Honda honda = new Honda("Honda City", "DL8CAF4321", "Neha", 90);

        System.out.println("=== Hero Bike ===");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg#: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println("\n=== Honda Car ===");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Reg#: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}