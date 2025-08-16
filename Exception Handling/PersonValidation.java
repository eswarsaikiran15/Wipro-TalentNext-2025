class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

public class PersonValidation {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide name and age.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be >= 18 and < 60");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: age must be a number");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
