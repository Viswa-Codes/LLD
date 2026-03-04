package TicTacToe;

public class TicTacToe {
     public static void main(String[] args) {
        System.out.println("\n===>>> TicTacToe Game\n");
        Game game = new Game();
        // game.intializeGame();
        String status = game.startGame();
        System.out.print("\n===>>> GAME OVER: ");
        switch (status) {
            case "Winner":
                System.out.print(game.winner.name + " won the game");
                break;
            case "Tie":
                System.out.print(" Its a Draw!");
                break;
            default:
                System.out.print(" Game Ends");
                break;
        }

    }
}
