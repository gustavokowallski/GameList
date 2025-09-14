package project.games.personal.exception;


@SuppressWarnings("serial")
public class ConflictException extends RuntimeException {

    public ConflictException(String msg) {
        super(msg);
    }
}