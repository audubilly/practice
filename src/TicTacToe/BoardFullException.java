package TicTacToe;

public class BoardFullException extends Exception{
    public BoardFullException() {
    }

    public BoardFullException(String message) {
        super(message);
    }
}
