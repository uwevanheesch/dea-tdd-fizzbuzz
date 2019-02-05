package nl.han.oose;

public class InvalidTurnException extends RuntimeException {

    private int turn;

    public InvalidTurnException(String message, int turn) {
        super(message);
        this.turn = turn;
    }

    public int getTurn() {
        return turn;
    }
}
