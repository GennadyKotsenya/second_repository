package GameTicTacToe;

public class Task4 {
    public static void main(String[] args) {
//        int[][] grid = {{ 2, 0, 1 },
//                        { 0, 2, 1 },
//                        { 1, 2, 1 }};


//        int[][] grid = {{ 2, 0, 1 },
//                        { 0, 2, 0 },
//                        { 1, 2, 1 }};

//        int[][] grid = {{ 0, 2, 1 },
//                        { 0, 2, 0 },
//                        { 1, 2, 1 }}


//        int[][] grid = {{ 2, 2, 2 },
//                        { 0, 1, 0 },
//                        { 1, 0, 1 }};


//        int[][] grid = {{ 2, 1, 2 },
//                        { 0, 2, 1 },
//                        { 1, 0, 2 }};


//        int[][] grid = {{ 1, 0, 2 },
//                        { 2, 1, 0 },
//                        { 1, 2, 1 }};

//        int[][] grid = {{ 1, 0, 2 },
//                        { 1, 1, 0 },
//                        { 1, 2, 2 }};


//        int[][] grid = {{ 2, 0, 1 },
//                        { 2, 1, 0 },
//                        { 1, 2, 0 }};


        int[][] grid = {{2, 2, 1},
                        {2, 1, 0},
                        {2, 2, 1}};

//        int[][] grid = {{1, 1, 1, 1},
//                        {2, 2, 2, 0},
//                        {0, 0, 0, 0},
//                        {0, 0, 0, 0}}  ;

//        int[][] grid = { {1, 0, 1, 0, 2},
//                         {0, 2, 0, 1, 0},
//                         {1, 0, 0, 2, 0},
//                         {0, 1, 0, 2, 0},
//                         {2, 0, 0, 0, 1} }  ;

        System.out.println(determineWinner(grid));
    }

    public static int determineWinner(int[][] grid) {

        int counterRepeatSymbol = 1;

        int x = 1;
        int o = 2;

//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid.length; j++) {
//
//                if (j != 0 && grid[i][j] == grid[i][j - 1]) {
//                    counterRepeatSymbol++;
//                }
//
//                if (j == grid.length - 1 && counterRepeatSymbol == grid.length) {
//                    if (grid[i][j] == x) {
//                        return x;
//                    } else if (grid[i][j] == o) {
//                        return o;
//                    }
//                }
//            }
//            counterRepeatSymbol = 1;
//        }

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

        System.out.println("---------------");
        return 0;
    }
}
