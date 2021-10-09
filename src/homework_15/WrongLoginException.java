package homework_15;

public class WrongLoginException extends RuntimeException{
    private String detail;

    public WrongLoginException() {
        detail = "Login is incorrect";
    }

    public WrongLoginException(String message) {
        super(message);
        detail = message;
    }
    @Override
    public String toString(){
        return "WrongLoginException: " + detail;
    }
}
