package Packages;

public class AutomobileTest {
    static abstract class Vehicle {
        public abstract String getModelName();
        public abstract String getRegistrationNumber();
        public abstract String getOwnerName();
    }

    static class Hero extends Vehicle {
        private String modelName, registrationNumber, ownerName;
        private int speed;

        public Hero(String modelName, String regNum, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = regNum;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() { return modelName; }
        public String getRegistrationNumber() { return registrationNumber; }
        public String getOwnerName() { return ownerName; }
        public int getSpeed() { return speed; }

        public void radio() {
            System.out.println("Hero Radio: Playing FM channels...");
        }
    }

    static class Honda extends Vehicle {
        private String modelName, registrationNumber, ownerName;
        private int speed;

        public Honda(String modelName, String regNum, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = regNum;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() { return modelName; }
        public String getRegistrationNumber() { return registrationNumber; }
        public String getOwnerName() { return ownerName; }
        public int getSpeed() { return speed; }

        public void cdplayer() {
            System.out.println("Honda CD Player: Spinning up your playlist...");
        }
    }

    static class Logan extends Vehicle {
        private String modelName, registrationNumber, ownerName;
        private int speed;

        public Logan(String modelName, String regNum, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = regNum;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() { return modelName; }
        public String getRegistrationNumber() { return registrationNumber; }
        public String getOwnerName() { return ownerName; }
        public int speed() { return speed; }

        public int gps() {
            System.out.println("Logan GPS: Navigation system activated.");
            return 1;
        }
    }

    static class Ford extends Vehicle {
        private String modelName, registrationNumber, ownerName;
        private int speed;

        public Ford(String modelName, String regNum, String ownerName, int speed) {
            this.modelName = modelName;
            this.registrationNumber = regNum;
            this.ownerName = ownerName;
            this.speed = speed;
        }

        public String getModelName() { return modelName; }
        public String getRegistrationNumber() { return registrationNumber; }
        public String getOwnerName() { return ownerName; }
        public int speed() { return speed; }

        public int tempControl() {
            System.out.println("Ford AC Control: Cabin temperature optimized.");
            return 22;
        }
    }

    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "HR26AB1234", "Rajesh", 55);
        Honda honda = new Honda("Honda Shine", "KA03MN4321", "Sneha", 65);
        Logan logan = new Logan("Logan LX", "TN10AB9988", "Siddharth", 120);
        Ford ford = new Ford("Ford Fiesta", "MH12XY7890", "Priya", 140);

        System.out.println("🚲 TwoWheeler Vehicles:");
        System.out.println(hero.getModelName() + " owned by " + hero.getOwnerName() + ", Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println(honda.getModelName() + " owned by " + honda.getOwnerName() + ", Speed: " + honda.getSpeed());
        honda.cdplayer();

        System.out.println("\n🚗 FourWheeler Vehicles:");
        System.out.println(logan.getModelName() + " owned by " + logan.getOwnerName() + ", Speed: " + logan.speed());
        logan.gps();

        System.out.println(ford.getModelName() + " owned by " + ford.getOwnerName() + ", Speed: " + ford.speed());
        ford.tempControl();
    }
}