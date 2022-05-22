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


//        int[][] grid = {{2, 0, 1},
//                        {0, 0, 1},
//                        {2, 0, 1}};

//        int[][] grid = {{1, 1, 1, 1},
//                        {2, 2, 2, 0},
//                        {0, 0, 0, 0},
//                        {0, 0, 0, 0}}  ;

        int[][] grid = { {1, 2, 0, 1, 2},
                         {1, 0, 2, 0, 2},
                         {2, 0, 0, 2, 0},
                         {1, 0, 1, 0, 1},
                         {1, 2, 0, 1, 0} }  ;

        System.out.println(determineWinner(grid));
    }

    public static int determineWinner(int[][] grid) {

        int counterRepeatSymbol = 1;

        int x = 1;
        int o = 2;
        int draw = -1;

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
//
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid.length; j++) {
//
//                if (j != 0 && grid[j][i] == grid[j - 1][i]) {
//                    counterRepeatSymbol++;
//                }
//
//                if (j == grid.length - 1 && counterRepeatSymbol == grid.length) {
//                    if (grid[j][i] == x) {
//                        return x;
//                    } else if (grid[j][i] == o) {
//                        return o;
//                    }
//                }
//
//            }
//
//            counterRepeatSymbol = 1;
//        }
//
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid.length; j++) {
//
//                if(i == j) {
//                    if (i != 0 && grid[i][j] == grid[i - 1][j - 1]) {
//                        counterRepeatSymbol++;
//                    }
//
//                    if (j == grid.length - 1 && counterRepeatSymbol == grid.length) {
//                        if (grid[i][j] == x) {
//                            return x;
//                        } else if (grid[i][j] == o) {
//                            return o;
//                        }
//                    }
//                }
//            }
//
//        }
//        counterRepeatSymbol = 1;
//
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid.length; j++) {
//
//                if(i == (grid.length - 1 - j)) {
//                    if (i != 0 && grid[i][j] == grid[i - 1][j + 1]) {
//                        counterRepeatSymbol++;
//                    }
//
//                    if (i == grid.length - 1 && counterRepeatSymbol == grid.length) {
//                        if (grid[i][j] == x) {
//                            return x;
//                        } else if (grid[i][j] == o) {
//                            return o;
//                        }
//                    }
//                }
//            }
//
//        }
//        counterRepeatSymbol = 1;

        int counterX = 0;
        int counterO = 0;
        int counter = 0;


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {

                if(grid[i][j] == x) {
                    counterX++;
                } else if(grid[i][j] == o) {
                    counterO++;
                }
                if(j == grid.length - 1 && counterX > 0 && counterO > 0){
                    counter++;
                }

                if(counter == grid.length - 1){
                    return draw;
                }
            }
            counterX = 0;
            counterO = 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.println("j,i = " + j +","+i);

                if(grid[j][i] == x) {
                    counterX++;
                }
                if(grid[j][i] == o) {
                    counterO++;
                }
                if(j == grid.length - 1 && counterX > 0 && counterO > 0){
                    counter++;
                    System.out.println("counter = " + counter);
                }

                if(counter == grid.length){
                    return draw;
                }
                if(j == grid.length - 1){
                    counterX = 0;
                    counterO = 0;
                }
            }

        }




        System.out.println("---------------");
        return 0;
    }
}
