package consol_games;

import java.util.Scanner;

public class GameTicTacToe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] arraySymbols = new int[3][3];

        int counter = 0;
        int finalResult;

        print(arraySymbols);

        System.out.println();

        System.out.println("Player 1 (X) turn. "
                + "Enter two digits (from 1 to 3) separated by a space: ");

        while (scanner.hasNextLine()) {

            Cell cell = parseMove(scanner.nextLine());

            if (cell == null) {

                System.out.println("Incorrect input.");
                System.out.println();

                printHintLine(counter, 1);
                continue;
            }

            if (arraySymbols[cell.col - 1][cell.row - 1] != 0) {

                System.out.println("Cell should be empty.");
                System.out.println();

                printHintLine(counter, 1);
                continue;
            }

            if (counter % 2 == 0) {

                arraySymbols[cell.col - 1][cell.row - 1] = 1;

            } else {
                arraySymbols[cell.col - 1][cell.row - 1] = 2;
            }
            System.out.println();
            print(arraySymbols);
            finalResult = determineWinner(arraySymbols);
            System.out.println();

            if (finalResult == 1) {
                System.out.println("Win player 1 (X) ");
                return;
            } else if (finalResult == 2) {
                System.out.println("Win player 2 (0) ");
                return;
            } else if (finalResult == -1) {
                System.out.println("Draw");
                return;
            }

            printHintLine(counter, 0);
            counter++;
        }
        System.out.println();
        System.out.println("Draw");
    }

    public static void print(int[][] grid) {

        String[][] grid2 = new String[grid.length][grid.length];

        String[][] newGrid = new String[grid.length + (grid.length - 1)][grid.length + (grid.length - 1)];

        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {

                grid2[i][j] = String.valueOf(grid[i][j]);
            }
        }

        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {

                newGrid[i + i][j + j] = grid2[i][j];

                if (j == grid2.length - 1 && i != grid2.length - 1) {
                    newGrid[i + i + 1][j + j] = "━━";
                } else if (i == grid2.length - 1 && j != grid2.length - 1) {
                    newGrid[i + i][j + j + 1] = "┃";
                } else if (i != grid2.length - 1 && j != grid2.length - 1) {
                    newGrid[i + i + 1][j + j + 1] = "━╋━";
                    if (j == 0) {
                        newGrid[i + i + 1][j + j] = "━━";
                    } else {
                        newGrid[i + i + 1][j + j] = "━";
                    }
                    newGrid[i + i][j + j + 1] = "┃";
                }
            }
        }

        for (int i = 0; i < newGrid.length; i++) {
            for (int j = 0; j < newGrid[i].length; j++) {

                if ("0".equals(newGrid[i][j])) {
                    System.out.print("   ");
                } else if ("1".equals(newGrid[i][j])) {
                    System.out.print(" X ");
                } else if ("2".equals(newGrid[i][j])) {
                    System.out.print(" 0 ");
                } else {
                    System.out.print(newGrid[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static int determineWinner(int[][] grid) {

        int counterRepeatSymbol = 1;

        int x = 1;
        int o = 2;
        int draw = -1;
        int uncertainty = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (j != 0 && grid[i][j] == grid[i][j - 1]) {
                    counterRepeatSymbol++;
                }

                if (j == grid.length - 1 && counterRepeatSymbol == grid.length) {
                    if (grid[i][j] == x) {
                        return x;
                    } else if (grid[i][j] == o) {
                        return o;
                    }
                }
            }
            counterRepeatSymbol = 1;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (j != 0 && grid[j][i] == grid[j - 1][i]) {
                    counterRepeatSymbol++;
                }

                if (j == grid.length - 1 && counterRepeatSymbol == grid.length) {
                    if (grid[j][i] == x) {
                        return x;
                    } else if (grid[j][i] == o) {
                        return o;
                    }
                }
            }
            counterRepeatSymbol = 1;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (i == j) {
                    if (i != 0 && grid[i][j] == grid[i - 1][j - 1]) {
                        counterRepeatSymbol++;
                    }

                    if (j == grid.length - 1 && counterRepeatSymbol == grid.length) {
                        if (grid[i][j] == x) {
                            return x;
                        } else if (grid[i][j] == o) {
                            return o;
                        }
                    }
                }
            }
        }
        counterRepeatSymbol = 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (i == (grid.length - 1 - j)) {
                    if (i != 0 && grid[i][j] == grid[i - 1][j + 1]) {
                        counterRepeatSymbol++;
                    }

                    if (i == grid.length - 1 && counterRepeatSymbol == grid.length) {
                        if (grid[i][j] == x) {
                            return x;
                        } else if (grid[i][j] == o) {
                            return o;
                        }
                    }
                }
            }
        }

        int counterX = 0;
        int counterO = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (grid[i][j] == x) {
                    counterX++;
                } else if (grid[i][j] == o) {
                    counterO++;
                }
                if (j == grid.length - 1 && (counterX < 1 || counterO < 1)) {
                    return uncertainty;
                }
            }
            counterX = 0;
            counterO = 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (grid[j][i] == x) {
                    counterX++;
                }
                if (grid[j][i] == o) {
                    counterO++;
                }
                if (j == grid.length - 1 && (counterX < 1 || counterO < 1)) {
                    return uncertainty;
                }

                if (j == grid.length - 1) {
                    counterX = 0;
                    counterO = 0;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (i == j) {
                    if (grid[i][j] == x) {
                        counterX++;
                    } else if (grid[i][j] == o) {
                        counterO++;
                    }

                    if (j == grid.length - 1 && (counterX < 1 || counterO < 1)) {
                        return uncertainty;
                    }
                }
            }
        }
        counterX = 0;
        counterO = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if (i == (grid.length - 1 - j)) {
                    if (grid[i][j] == x) {
                        counterX++;
                    } else if (grid[i][j] == o) {
                        counterO++;
                    }

                    if (i == grid.length - 1 && (counterX < 1 || counterO < 1)) {
                        return uncertainty;
                    }
                }
            }
        }
        return draw;
    }

    public static class Cell {
        public int row;
        public int col;
    }

    public static Cell parseMove(String line) {

        char[] arrayCr = line.toCharArray();

        if (arrayCr.length < 3) {
            return null;
        }

        Cell cell = new Cell();
        int counterInts = 0;

        for (int i = 0; i < arrayCr.length; i++) {
            if (arrayCr[i] != 32 && arrayCr[i] < 48 || arrayCr[i] > 52) {
                return null;
            }
            if (arrayCr[i] > 48 && arrayCr[i] < 52) {
                counterInts++;
                cell.row = Character.getNumericValue(arrayCr[i]);
            }
            if (i == arrayCr.length - 1 && counterInts != 2) {
                return null;
            }
        }
        for (int i = arrayCr.length - 1; i >= 0; i--) {


            if (arrayCr[i] > 48 && arrayCr[i] < 52) {
                cell.col = Character.getNumericValue(arrayCr[i]);
            }
        }

        return cell;
    }

    public static void printHintLine(int counter, int x) {
        if (counter % 2 == x) {

            System.out.println("Player 2 (0) turn. "
                    + "Enter two digits (from 1 to 3) separated by a space:");
        } else {

            System.out.println("Player 1 (X) turn. "
                    + "Enter two digits (from 1 to 3) separated by a space: ");
        }
    }
}
