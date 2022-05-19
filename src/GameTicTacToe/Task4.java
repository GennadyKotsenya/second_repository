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
//                        { 1, 2, 1 }};


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


//        int[][] grid = {{1, 2, 2},
//                        {2, 1, 1},
//                        {0, 1, 2}};

//        int[][] grid = {{1, 1, 1, 1},
//                        {2, 2, 2, 0},
//                        {0, 0, 0, 0},
//                        {0, 0, 0, 0}}  ;

        int[][] grid = { {1, 0, 1, 0, 2},
                         {0, 2, 0, 1, 0},
                         {1, 0, 0, 2, 0},
                         {0, 1, 0, 2, 0},
                         {2, 0, 0, 0, 1} }  ;

        System.out.println(determineWinner(grid));
    }

    public static int determineWinner(int[][] grid) {


        int sumDiagonalToRightX = 0;
        int sumDiagonalToRightO = 0;
        int sumDiagonalToLeftX = 0;
        int sumDiagonalToLeftO = 0;
        int sumOfColumnX = 0;
        int sumOfColumnO = 0;
        int sumOfLineX = 0;
        int sumOfLineO = 0;
        int resultX = grid.length;
        int resultO = 2 * grid.length;
        boolean less = false;

        int x = 1;
        int o = 2;
        int draw = -1;

        int forDrawGame = x + o;

        for (int i = 0; i < grid.length; i++) {
            System.out.println("i = " + i);
            System.out.println("sumOfColumnX, sumOfColumnO, forDrawGame = "+sumOfColumnX+ " , "+ sumOfColumnO +" , "+forDrawGame);
            if(i != 0 && (sumOfColumnX >= x && sumOfColumnO >= o) && (sumOfColumnX != resultX && sumOfColumnO != resultO)){
                less = true;
            }
            sumOfColumnX = 0;
            sumOfColumnO = 0;

            for (int j = 0; j < grid.length; j++) {
                System.out.println("j = " + j);

                if (grid[j][i] == x) {
                    System.out.println("sumOfColumnX += " + grid[j][i]);
                    sumOfColumnX += grid[j][i];
                    System.out.println("sumOfColumnX = " + sumOfColumnX);
                } else if (grid[j][i] == o) {

                    System.out.println("sumOfColumnO += " + grid[j][i]);
                    sumOfColumnO += grid[j][i];
                    System.out.println("sumOfColumnO = " + sumOfColumnO);

                }

                if (j == grid.length - 1) {
                    System.out.println("return0");
                    if (sumOfColumnX == resultX)
                        return x;
                    else if (sumOfColumnO == resultO)
                        return o;
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            System.out.println("i = " + i);
            sumOfLineX = 0;
            sumOfLineO = 0;

            for (int j = 0; j < grid[i].length; j++) {
                System.out.println("j = " + j);

                if (grid[i][j] == x) {
                    System.out.println("if(grid[" + i + "][" + j + "] == 1) ");

                    if (i == j) {
                        System.out.println("sumDiagonalToRightX += " + grid[i][j]);
                        sumDiagonalToRightX += grid[i][j];
                        System.out.println("sumDiagonalToRightX = " + sumDiagonalToRightX);

                    }

                    if ((i + j) == grid.length - 1) {
                        System.out.println("sumDiagonalToLeftX += " + grid[i][j]);
                        sumDiagonalToLeftX += grid[i][j];
                        System.out.println("sumDiagonalToLeftX = " + sumDiagonalToLeftX);

                    }

                    System.out.println("sumOfLineX += " + grid[i][j]);
                    sumOfLineX += grid[i][j];
                    System.out.println("sumOfLineX = " + sumOfLineX);

                } else if (grid[i][j] == o) {
                    System.out.println("grid[i][j]  == 2");


                    if (i == j) {
                        System.out.println("sumDiagonalToRightO += " + grid[i][j]);
                        sumDiagonalToRightO += grid[i][j];
                        System.out.println("sumDiagonalToRightO = " + sumDiagonalToRightO);

                    }

                    if ((i + j) == grid.length - 1) {
                        System.out.println("sumDiagonalToLeftO += " + grid[i][j]);
                        sumDiagonalToLeftO += grid[i][j];
                        System.out.println("sumDiagonalToLeftO = " + sumDiagonalToLeftO);

                    }
                    System.out.println("sumOfLineO += " + grid[i][j]);
                    sumOfLineO += grid[i][j];
                    System.out.println("sumOfLineO = " + sumOfLineO);

                }

                if (i == grid.length - 1 && j == 0) {
                    System.out.println("return1");

                    if (sumDiagonalToLeftX == resultX)
                        return x;
                    else if (sumDiagonalToLeftO == resultO)
                        return o;

                }
                if (j == grid.length - 1) {
                    System.out.println("return2");
                    if (sumOfLineX == resultX)
                        return x;
                    else if (sumOfLineO == resultO)
                        return o;
                }
                if (i == grid.length - 1 && j == grid.length - 1) {
                    System.out.println("return3");
                    if (sumDiagonalToRightX == resultX)
                        return x;
                    else if (sumDiagonalToRightO == resultO)
                        return o;
                }

                System.out.println("------cycle--------");
            }



        }

        if (!less && (sumDiagonalToLeftO > forDrawGame || sumDiagonalToLeftX > forDrawGame) &&
                (sumDiagonalToRightO > forDrawGame || sumDiagonalToRightX > forDrawGame) &&
                (sumOfLineO > forDrawGame || sumOfLineX > forDrawGame) &&
                (sumOfColumnO > forDrawGame || sumOfColumnX > forDrawGame)) {
            return draw;

        }


        return 0;
    }
}
