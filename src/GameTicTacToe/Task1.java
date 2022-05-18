package GameTicTacToe;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String empty = " ";

        String[][] arraySymbols = new String[3][3];

        String x = "X";
        String o = "0";
        int column;
        int row;
        int counter = 0;


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){

                arraySymbols[i][j] = empty;
                System.out.print(arraySymbols[i][j]);

            }

            System.out.println();
        }

        System.out.println();

        System.out.println("Player 1 (X) turn. "
                +"Enter column and row (between 1 and 3): ");

        System.out.println();

        while(scanner.hasNextInt()){

            column = scanner.nextInt();
            row = scanner.nextInt();

            if(counter % 2 == 0){
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){

                        if(i == column - 1 && j == row - 1){

                            arraySymbols[i][j] = x;

                        }
                        System.out.print(arraySymbols[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            } else {
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){

                        if(i == column - 1 && j == row - 1){

                            arraySymbols[i][j] = o;

                        }
                        System.out.print(arraySymbols[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }

            if(counter % 2 == 0){

                System.out.println("Player 2 (0) turn. "
                        +"Enter column and row (between 1 and 3):");

                System.out.println();
            } else {

                System.out.println("Player 1 (X) turn. "
                        +"Enter column and row (between 1 and 3): ");

                System.out.println();

            }
            counter++;
        }

        System.out.println("Draw");

    }
}
