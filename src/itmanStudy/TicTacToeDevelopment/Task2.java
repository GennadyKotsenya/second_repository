package itmanStudy.TicTacToeDevelopment;
/*
Теперь научимся выводить поле более красиво.

Для этого напишем универсальную функцию,
которая принимает матрицу целых чисел N*N (1 <= N <= 300), значения могут быть:

0 — клетка свободна
1 — клетка занята первым игроком
2 — клетка занята вторым игроком
Функция должна выводить отформатированное поле:

каждая клетка должна быть размером 3 столбца и 1 строка (без учета границ).
символ X или 0 должны располагаться по центру
для рамки использовать следующие символы: ━, ┃, ╋.
 */

public class Task2 {
    public static void main(String[] args) {

//        int[][] grid = {{ 2, 0, 1 },
//                        { 0, 1, 2 },
//                        { 1, 0, 0 }};
        int[][] grid = new int[3][3];
//        int[][] grid = {{ 1, 2 }, { 2, 1 }};
//        int[][] grid = {{1}};
//        int[][] grid = {{0}};


        print(grid);

    }

    public static void print(int[][] grid) {

        String[][] grid2 = new String[grid.length][grid.length];

        String[][] newGrid = new String[grid.length + (grid.length - 1)][grid.length + (grid.length - 1)];

        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {

                if (grid.length > i && grid[0].length > j) {

                    grid2[i][j] = String.valueOf(grid[i][j]);

                } else grid2[i][j] = "0";

            }
        }

        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {

                newGrid[i + i][j + j] = grid2[i][j];

                if(j == grid2.length - 1 && i != grid2.length - 1){
                    newGrid[i + i + 1][j + j] = "━━";
                } else if(i == grid2.length - 1 && j != grid2.length - 1){
                    newGrid[i + i][j + j + 1] = "┃";
                } else if(i != grid2.length - 1 && j != grid2.length - 1){
                    newGrid[i + i + 1][j + j + 1] = "━╋━";
                    if(j == 0) {
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

        System.out.println();
    }
}
