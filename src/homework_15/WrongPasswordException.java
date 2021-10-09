package homework_15;

public class WrongPasswordException extends RuntimeException{
    private String detail;

    public WrongPasswordException() {
        detail = "Password is incorrect";
    }

    public WrongPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}
