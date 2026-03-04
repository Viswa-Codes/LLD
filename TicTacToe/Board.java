package TicTacToe;

import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int boardSize) {
        this.size = boardSize;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece Pp) {
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = Pp;
        return true;
    }

    public List<SimpleEntry<Integer, Integer>> getFreeCells() {
        List<SimpleEntry<Integer, Integer>> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    freeCells.add(new SimpleEntry<>(i, j));
                }
            }
        }

        return freeCells;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].piecetype + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}