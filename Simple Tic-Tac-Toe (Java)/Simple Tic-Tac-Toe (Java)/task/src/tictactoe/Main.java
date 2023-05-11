package tictactoe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        // read line from console
        Scanner scanner = new Scanner(System.in);

        char[][] game = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = '-';
            }
        }
        printBoard(game);

        int numberOfMoves = 0;
        boolean gameOver = false;
        char[] players = new char[] {'X', 'O'};
        int playerNumber = 0;
        char player = players[playerNumber];
        while (!gameOver && numberOfMoves < 9) {
            // prompt user for the move
            System.out.println("\nPlease enter a valid move with two coordinate numbers (both from 1 to 3)");
            boolean validInput = false;
            while (!validInput) {
                try {
                    int m = scanner.nextInt();
                    int n = scanner.nextInt();

                    if (outOfBoard(m, n)) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        continue;
                    }

                    if (isOccupiedCell(game, m, n)) {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                    validInput = true;
                    game[m-1][n-1] = player;
                    numberOfMoves += 1;
                    printBoard(game);
                    gameOver = isGameOver(game);

                    // change to next player
                    playerNumber = 1 - playerNumber;
                    player = players[playerNumber];

                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("You should enter numbers!");
                }
            }
        }
    }


    public static boolean playerWins(char[][] game, char player) {
        // horizontal win
        for (int i = 0; i < 3; i++) {
            if (game[i][0] == player && game[i][1] == player && game[i][2] == player) {
                return true;
            }
        }

        // vertical win
        for (int j = 0; j < 3; j++) {
            if (game[0][j] == player && game[1][j] == player && game[2][j] == player) {
                return true;
            }
        }

        // diagonal win /
        if (game[2][0] == player && game[1][1] == player && game[0][2] == player ) {
            return true;
        }


        // diagonal win \
        if (game[0][0] == player && game[1][1] == player && game[2][2] == player ) {
            return true;
        }

        return false;
    }

    public static boolean isGameOver(char[][] game) {
        if (playerWins(game, 'X') && playerWins(game, 'O')
                || (Math.abs(countPlayer(game, 'X') - countPlayer(game, 'O')) > 1)) {
            System.out.print("Impossible");
            return true;
        }

        if (!playerWins(game, 'X') && !playerWins(game, 'O')) {
            System.out.print("Game not finished");
            return false;
        } else if (playerWins(game, 'X')) {
            System.out.print("X wins");
        } else if (playerWins(game, 'O')) {
            System.out.print("O wins");
        } else if (!playerWins(game, 'X') && !playerWins(game, 'O')) {
            System.out.print("Draw");
        }
        return true;
    }



    public static boolean isOccupiedCell(char[][] game, int m, int n) {
        return game[m-1][n-1] == 'X' || game[m-1][n-1] == 'O';
    }
    public static boolean outOfBoard(int m, int n) {
        if (m > 3 || m < 1 || n > 3 || n < 1) {
            return true;
        }
        return false;
    }
    public static void printBoard(char[][] game) {
        System.out.printf(
                "---------\n" +
                        "| %c %c %c |\n" +
                        "| %c %c %c |\n" +
                        "| %c %c %c |\n" +
                        "---------\n",
                game[0][0],game[0][1],game[0][2],
                game[1][0],game[1][1],game[1][2],
                game[2][0],game[2][1],game[2][2]);
    }

    public static int countPlayer(char[][] game, char player) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (game[i][j] == player) {
                    count++;
                }
            }
        }

        return count;
    }



}
