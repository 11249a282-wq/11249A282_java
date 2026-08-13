class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class VotingSystem {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age is below 18. Not eligible for voting.");
        } else {
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("InvalidAgeException: " + e.getMessage());
        }
    }
}