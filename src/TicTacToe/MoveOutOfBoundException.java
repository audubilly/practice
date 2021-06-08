package TicTacToe;

public class MoveOutOfBoundException extends Exception{
    public MoveOutOfBoundException() {
    }

    public MoveOutOfBoundException(String message) {
        super(message);
    }
}
