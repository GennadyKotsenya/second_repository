package GameTicTacToe;

public class Task4 {
    public static void main(String[] args) {
//        int[][] grid = {{ 2, 0, 1 },
//                        { 0, 2, 1 },
//                        { 1, 2, 1 }};

//        int[][] grid = {{ 2, 1, 2 },
//                        { 0, 2, 1 },
//                        { 1, 0, 2 }};

//        int[][] grid = {{ 1, 0, 2 },
//                        { 2, 1, 0 },
//                        { 1, 2, 1 }};

//        int[][] grid = {{ 1, 0, 2 },
//                        { 1, 1, 0 },
//                        { 1, 2, 2 }};
//---

//        int[][] grid = {{ 2, 0, 1 },
//                        { 2, 1, 0 },
//                        { 1, 2, 0 }};
//   ---

        int[][] grid = {{ 1, 0, 0 },
                        { 1, 1, 0 },
                        { 2, 2, 2 }};


        System.out.println(determineWinner(grid));
    }

    public static int determineWinner(int[][] grid){


        int sumColumnX = 0;
        int sumColumnO = 0;
        int sumDiagonalRightX = 0;
        int sumDiagonalRightO = 0;
        int sumDiagonalLeftX = 0;
        int sumDiagonalLeftO = 0;


        for(int i = 0; i < grid.length; i++){
            System.out.println("i = " + i);
            int sumRowX = 0;
            int sumRowO = 0;

            for(int j = 0; j < grid[i].length; j++){
                System.out.println("j = " + j);

                if (i == grid.length - 1) {
                    if (sumColumnX == 3)
                        return 3;
                    else if (sumDiagonalRightX == 3)
                        return 3;
                }

                if (i == grid.length - 1 && j == 0) {
                    if (sumDiagonalLeftX == 3)
                        return 3;
                }
                if (j == grid.length - 1) {
                    if (sumRowX == 3)
                        return 1;
                }
                if (i == grid.length - 1) {
                    if (sumColumnO == 6)
                        return 2;
                }
                if (i == grid.length - 1) {
                    if (sumDiagonalRightO == 6)
                        return 2;
                }
                if (i == grid.length - 1 && j == 0) {
                    if (sumDiagonalLeftO == 6)
                        return 2;
                }
                if (j == grid.length - 1) {
                    if (sumRowO == 6)
                        return 2;
                }



                if(grid[i][j] == 1) {
                    System.out.println("if(grid["+i+"]["+j+"] == 1) ");

                    if (j == 0) {
                        System.out.println("sumColumnX += " +grid[i][j]);
                        sumColumnX += grid[i][j];
                        System.out.println("sumColumnX = " +sumColumnX);

                    }

                    if (i == j) {
                        System.out.println("sumDiagonalRightX += "+grid[i][j]);
                        sumDiagonalRightX += grid[i][j];
                        System.out.println("sumDiagonalRightX = " + sumDiagonalRightX);

                    }

                    if ((i + j) == grid.length - 1) {
                        System.out.println("sumDiagonalLeftX += "+grid[i][j]);
                        sumDiagonalLeftX += grid[i][j];
                        System.out.println("sumDiagonalLeftX = " + sumDiagonalLeftX);

                    }

                    System.out.println("sumRowX += "+grid[i][j]);
                    sumRowX += grid[i][j];
                    System.out.println("sumRowX = " + sumRowX);

                } else if(grid[i][j] == 2) {
                    System.out.println("grid[i][j]  == 2");
                    if (j == 0) {
                        System.out.println("sumColumnO += "+grid[i][j]);
                        sumColumnO += grid[i][j];
                        System.out.println("sumColumnO = " + sumColumnO);

                    }

                    if (i == j) {
                        System.out.println("sumDiagonalRightO += "+grid[i][j]);
                        sumDiagonalRightO += grid[i][j];
                        System.out.println("sumDiagonalRightO = " + sumDiagonalRightO);

                    }

                    if ((i + j) == grid.length - 1) {
                        System.out.println("sumDiagonalLeftO += "+grid[i][j]);
                        sumDiagonalLeftO += grid[i][j];
                        System.out.println("sumDiagonalLeftO = " + sumDiagonalLeftO);

                    }
                    System.out.println("sumRowO += "+grid[i][j]);
                    sumRowO += grid[i][j];
                    System.out.println("sumRowO = " + sumRowO);


                }
                System.out.println();
                System.out.println("cycle");
                System.out.println();
            }
        }

        return 0;
    }
}
