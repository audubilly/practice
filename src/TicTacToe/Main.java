package TicTacToe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while(!gameOver){
            try {
                game.displayBoard();
                System.out.println("Enter a position on the board");
                int position = scanner.nextInt();
                game.makeMove(position);
            }catch (GameOverException e){
                if(game.lastPlayedWasX){
                    System.out.println("X WON");
                    game.displayBoard();
                }else {
                    System.out.println("Y WON");
                }
                gameOver = true;

            } catch (BoardFullException e) {
                System.out.println("It's a Draw");
                gameOver = true;

            } catch (AlreadyOccupiedException e) {
                System.out.println("That position is already occupied");
            }catch (MoveOutOfBoundException e){
                e.printStackTrace();
            }

        }
    }
}
