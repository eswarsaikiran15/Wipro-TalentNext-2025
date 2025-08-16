class InvalidCountryException extends Exception {
    public InvalidCountryException(String msg) {
        super(msg);
    }
}

public class UserRegistration {
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India  cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration reg = new UserRegistration();

        try {
            reg.registerUser("Mickey", "US");
            // Try changing to: reg.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
