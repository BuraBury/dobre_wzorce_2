package zadanie24;

public class EmptyBasketException extends Exception {
    String message = "No elements in the basket";

    @Override
    public String getMessage() {
        return message;
    }
}
