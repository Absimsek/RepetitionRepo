package JUL2025.JUL17.ExceptionCreating;

public class InvalidNumberException extends RuntimeException {
    // Exceptions can be created by coder as like creating an object
    // when a specific exception needed but there is no such thing in library you can declare it yourself.
    // to do that custom class should be inherited by an exception class already existing.

    public InvalidNumberException(String message){
        super(message);
    }

}
