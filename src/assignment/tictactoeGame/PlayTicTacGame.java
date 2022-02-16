package assignment.tictactoeGame;

import java.util.*;

public class PlayTicTacGame {

    private static final String[][] array = new String[3][3];
    private static final TicTacToeBoard board = new TicTacToeBoard(array);
    private static Player player1;
    private static Player player2;


    private static final Scanner userChoice = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(board.getBoard()));
        playerChoiceOfMarker();

        ticTacGame();
    }

    private static void ticTacGame() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Player1.... choose your position between 1 and 9");
            int position1 = userChoice.nextInt();
            position1 = validate(position1);
            check(position1, player1.getPlayer());
            printBoard();
            if (checkForOAndX(Cell.X)) return;
            if (checkForOAndX(Cell.O)) return;
            System.out.println("Player2.... choose your position between 1 and 9");
            int position2 = userChoice.nextInt();
            position2 = validate(position2);
            check(position2, player2.getPlayer());
            printBoard();
            if (checkForOAndX(Cell.X)) return;
            if (checkForOAndX(Cell.O)) return;
            if (i == 3 && !checkForOAndX(Cell.X) && !checkForOAndX(Cell.O)) System.out.println("Draw");

        }
    }

    private static void playerChoiceOfMarker() {
        System.out.println("Choose a marker (either X or O)");
        String marker = userChoice.next();
        while (!marker.toUpperCase().equals("X") && !marker.toUpperCase().equals("O")) {
            System.out.println("Choose a marker (either X or O)");
            marker = userChoice.next();
        }

        if (Objects.equals(marker.toUpperCase(), "X")) {
            player1 = new Player(Cell.X);
            player2 = new Player(Cell.O);
        } else {
            player1 = new Player(Cell.O);
            player2 = new Player(Cell.X);
        }
    }

    private static boolean checkForOAndX(Cell cell) {
        if (Objects.equals(board.getBoard()[0][0], cell.name()) &&
                Objects.equals(board.getBoard()[0][1], cell.name())
                && Objects.equals(board.getBoard()[0][2],cell.name()) ||
                Objects.equals(board.getBoard()[1][0], cell.name()) &&
                        Objects.equals(board.getBoard()[1][1], cell.name())
                        && Objects.equals(board.getBoard()[1][2], cell.name()) ||
                Objects.equals(board.getBoard()[2][0], cell.name()) &&
                        Objects.equals(board.getBoard()[2][1], cell.name())
                        && Objects.equals(board.getBoard()[2][2], cell.name())||
                Objects.equals(board.getBoard()[0][0], cell.name()) &&
                        Objects.equals(board.getBoard()[1][0], cell.name())
                        && Objects.equals(board.getBoard()[2][0],cell.name()) ||
                Objects.equals(board.getBoard()[0][1], cell.name()) &&
                        Objects.equals(board.getBoard()[1][1], cell.name())
                        && Objects.equals(board.getBoard()[2][1],cell.name()) ||
                Objects.equals(board.getBoard()[0][2],cell.name()) &&
                        Objects.equals(board.getBoard()[1][2],cell.name())
                        && Objects.equals(board.getBoard()[2][2],cell.name())||
                Objects.equals(board.getBoard()[0][0],cell.name()) &&
                        Objects.equals(board.getBoard()[1][1],cell.name())
                        && Objects.equals(board.getBoard()[2][2],cell.name()) ||
                Objects.equals(board.getBoard()[0][2], cell.name()) &&
                        Objects.equals(board.getBoard()[1][1], cell.name())
                        && Objects.equals(board.getBoard()[2][0], cell.name())

        ) {
            System.out.println(cell.name() + " wins");
            return true;
        }
        return false;
    }


    private static int validate(int position) {
        while (!(position >= 1) || !(position <= 9)) {
            System.out.println("Invalid input");
            System.out.println("Choose your position between 1 and 9");
            position = userChoice.nextInt();
        }
        return position;
    }

    private static void check(int position, Cell player) {

        switch (position) {
            case 1 -> board.getBoard()[0][0] = String.valueOf(player);
            case 2 -> board.getBoard()[0][1] = String.valueOf(player);
            case 3 -> board.getBoard()[0][2] = String.valueOf(player);
            case 4 -> board.getBoard()[1][0] = String.valueOf(player);
            case 5 -> board.getBoard()[1][1] = String.valueOf(player);
            case 6 -> board.getBoard()[1][2] = String.valueOf(player);
            case 7 -> board.getBoard()[2][0] = String.valueOf(player);
            case 8 -> board.getBoard()[2][1] = String.valueOf(player);
            case 9 -> board.getBoard()[2][2] = String.valueOf(player);
        }

    }

    private static void printBoard() {
        for (int i = 0; i < board.getBoard().length; i++) {
            for (int j = 0; j < board.getBoard()[i].length; j++) {
                System.out.print(board.getBoard()[i][j] + " ");
            }
            System.out.println();
        }
    }

}