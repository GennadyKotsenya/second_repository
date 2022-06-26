package itmanStudy.TicTacToeDevelopment;
/*
Научимся определять победителя.

Для этого напишем универсальную функцию,
которая принимает матрицу целых чисел N*N (1 <= N <= 300), значения могут быть:

0 — клетка свободна
1 — клетка занята первым игроком
2 — клетка занята вторым игроком
Функция должна возвращать:

1, если есть выигрышная комбинация для первого игрока
2, если есть выигрышная комбинация для второго игрока
-1, если уже никто победить не сможет (присутствуют 1 и 2 на любой строке, столбце, диагоналях)
0, если победителя еще нельзя определить
Выигрышная комбинация — вся строка или столбец, или диагональ заняты одним игроком.
 */
public class Task4 {
    public static void main(String[] args) {

        int[][] grid = {{2, 1, 2},
                        {2, 1, 1},
                        {1, 2, 0}};


//        int[][] grid = { {0, 2, 2, 1, 0},
//                         {1, 0, 1, 0, 2},
//                         {2, 1, 1, 2, 0},
//                         {1, 2, 0, 2, 1},
//                         {0, 2, 0, 1, 0} }  ;

        System.out.println(determineWinner(grid));
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
}
