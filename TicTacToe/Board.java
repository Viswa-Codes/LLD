package TicTacToe;

import java.util.List;
import java.util.ArrayList;
import java.util.AbstractMap.SimpleEntry;

public class Board {
    int size;
    PieceType[][] board;

    public Board(int boardSize) {
        this.size = boardSize;
        this.board = new PieceType[size][size];
    }

    public boolean addPiece(int row, int column, PieceType Pt) {
        if (board[row][column] != null) {
            return false;
        }
        board[row][column] = Pt;
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
                    System.out.print(board[i][j] + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}