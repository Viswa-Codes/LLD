package TicTacToe;

import java.util.AbstractMap.SimpleEntry;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player>players;
    Board board;
    public Player winner;

    public Game(){
        intializeGame();
    }
    private void intializeGame(){
         players = new LinkedList<>();
        board = new Board(3);
        Player p1 = new Player("Bhavya", PieceType.X);
        Player p2 = new Player("Viswatej", PieceType.O);

        players.add(p1);
        players.add(p2);

    }

    public String startGame(){
        boolean isWinnnerExists = false;
        while(!isWinnnerExists){
            Player currPlayer = players.removeFirst();
            board.printBoard();
            List<SimpleEntry<Integer, Integer>> freeSpaces = board.getFreeCells();
            if (freeSpaces.isEmpty()) {
                isWinnnerExists = true;
                continue;
            }

            // Read the user input
            System.out.print("Player: " + currPlayer.name + " - Please enter [row, column]: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            // Place the piece in the board
            boolean validMove = board.addPiece(inputRow, inputColumn, currPlayer.pt);
            if (!validMove) {
                // Invalid Move: Player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again!");
                players.addFirst(currPlayer); // Add the player back to the queue(in the front)
                continue;
            }

            players.addLast(currPlayer); 

             boolean isWinner = checkForWinner(inputRow, inputColumn, currPlayer.pt);
            if (isWinner) {
                board.printBoard();
                winner = currPlayer;
                return "Winner";
            }
        }
        return "Tie";
    }


    public boolean checkForWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check Row
        for (int i = 0; i < board.size; i++) {
            if (board.board[row][i] == null || board.board[row][i] != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // Check Column
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][column] == null || board.board[i][column] != pieceType) {
                columnMatch = false;
                break;
            }
        }

        // Check Diagonally
        for (int i = 0, j = 0; i < board.size; i++, j++) {
            if (board.board[i][j] == null || board.board[i][j] != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // Check Anti-Diagonally
        for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
            if (board.board[i][j] == null || board.board[i][j] != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

}
