package zadanie24;

public class BasketFullException extends Exception {
    String message = "Your basket is already full";

    @Override
    public String getMessage() {
        return message;
    }
}
