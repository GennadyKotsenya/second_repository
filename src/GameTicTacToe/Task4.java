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


        int[][] grid = {{ 1, 0, 2 },
                        { 1, 1, 0 },
                        { 2, 0, 2 }};


        System.out.println(determineWinner(grid));
    }

    public static int determineWinner(int[][] grid){



        int sumDiagonalToRightX = 0;
        int sumDiagonalToRightO = 0;
        int sumDiagonalToLeftX = 0;
        int sumDiagonalToLeftO = 0;

        for (int i = 0; i < grid.length; i++) {
            System.out.println("i = " + i);
            int sumOfColumnX = 0;
            int sumOfColumnO = 0;

            for (int j = 0; j < grid.length; j++) {
                System.out.println("j = " + j);

                if(grid[j][i] == 1) {
                    System.out.println("sumOfColumnX += " + grid[j][i]);
                    sumOfColumnX += grid[j][i];
                    System.out.println("sumOfColumnX = " + sumOfColumnX);
                } else if(grid[j][i] == 2) {

                    System.out.println("sumOfColumnO += "+grid[j][i]);
                    sumOfColumnO += grid[j][i];
                    System.out.println("sumOfColumnO = " + sumOfColumnO);

                }

                if (j == grid.length - 1 ) {
                    System.out.println("return0");
                    if (sumOfColumnX == 3)
                        return 1;
                    else if (sumOfColumnO == 6)
                        return 2;
                }
            }
        }

        for(int i = 0; i < grid.length; i++){
            System.out.println("i = " + i);
            int sumOfLineX = 0;
            int sumOfLineO = 0;

            for(int j = 0; j < grid[i].length; j++){
                System.out.println("j = " + j);

                if(grid[i][j] == 1) {
                    System.out.println("if(grid["+i+"]["+j+"] == 1) ");

                    if (i == j) {
                        System.out.println("sumDiagonalToRightX += "+grid[i][j]);
                        sumDiagonalToRightX += grid[i][j];
                        System.out.println("sumDiagonalToRightX = " + sumDiagonalToRightX);

                    }

                    if ((i + j) == grid.length - 1) {
                        System.out.println("sumDiagonalToLeftX += "+grid[i][j]);
                        sumDiagonalToLeftX += grid[i][j];
                        System.out.println("sumDiagonalToLeftX = " + sumDiagonalToLeftX);

                    }

                    System.out.println("sumOfLineX += "+grid[i][j]);
                    sumOfLineX += grid[i][j];
                    System.out.println("sumOfLineX = " + sumOfLineX);

                } else if(grid[i][j] == 2) {
                    System.out.println("grid[i][j]  == 2");


                    if (i == j) {
                        System.out.println("sumDiagonalToRightO += "+grid[i][j]);
                        sumDiagonalToRightO += grid[i][j];
                        System.out.println("sumDiagonalToRightO = " + sumDiagonalToRightO);

                    }

                    if ((i + j) == grid.length - 1) {
                        System.out.println("sumDiagonalToLeftO += "+grid[i][j]);
                        sumDiagonalToLeftO += grid[i][j];
                        System.out.println("sumDiagonalToLeftO = " + sumDiagonalToLeftO);

                    }
                    System.out.println("sumOfLineO += "+grid[i][j]);
                    sumOfLineO += grid[i][j];
                    System.out.println("sumOfLineO = " + sumOfLineO);

                }

                if (i == grid.length - 1 && j == 0) {
                    System.out.println("return1");

                    if (sumDiagonalToLeftX == 3)
                        return 1;
                    else if (sumDiagonalToLeftO == 6)
                        return 2;

                }
                if (j == grid.length - 1) {
                    System.out.println("return2");
                    if (sumOfLineX == 3)
                        return 1;
                    else if (sumOfLineO == 6)
                        return 2;
                }
                if (i == grid.length - 1 && j == grid.length - 1) {
                    System.out.println("return3");
                    if (sumDiagonalToRightX == 3)
                        return 1;
                    else if (sumDiagonalToRightO == 6)
                        return 2;
                }

                System.out.println("------cycle--------");
            }


        }

        return 0;
    }
}
