package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void testThatPlayerCanMakeAMove() throws AlreadyOccupiedException, MoveOutOfBoundException, BoardFullException, GameOverException {
        game.makeMove(9);
        Value[][] array = game.getBoard();
        assertEquals(Value.X, array[2][2]);

    }

    @Test
    void testThatXCannotBaePlayedTwice() throws BoardFullException, GameOverException, MoveOutOfBoundException, AlreadyOccupiedException {
        game.makeMove(9);
        Value[][] array = game.getBoard();
        assertEquals(Value.X, array[2][2]);

        game.makeMove(8);
        assertNotEquals(Value.X, array[2][1]);
        assertEquals(Value.O, array[2][1]);
    }

    @Test
    void testThatPlayerCantMakeOutOfBound() {
        assertThrows(MoveOutOfBoundException.class, () -> {
            game.makeMove(10);
        });
    }

    @Test
    void testThatWinnerCanBeDetermined() throws BoardFullException, MoveOutOfBoundException, AlreadyOccupiedException {
        try {
            game.makeMove(1); //X
            game.makeMove(4); //O
            game.makeMove(2); //X
            game.makeMove(5); //O
            game.makeMove(3); //X
            game.isGameWon();
            assertTrue(game.isGameWon());
        } catch (GameOverException ignored) {
        }
    }
}