package itmanStudy.Sort;

import java.util.Scanner;
/*
5 3
2 2 1
1 3 1
7 5 1
7 4 1
1 1 1

Дана матрица целых чисел N на M.
Отсортировать строки матрицы в порядке возрастания сумм элементов строки.
Строки с одинаковой суммой должны остаться в таком же порядке относительно друг друга
как были до сортировки.
 */
public class Tusk61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();


        int[] arraySum = new int[n];
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                array[i][j] =scanner.nextInt();

                arraySum[i] += array[i][j];

            }

        }

        for(int nn = arraySum.length; nn > 1; nn--){
            for(int i = 1; i < nn; i++){

                if(arraySum[i - 1] > arraySum[i]){
                    int t = arraySum[i - 1];
                    int[] r = array[i - 1];

                    arraySum[i - 1] = arraySum[i];
                    array[i - 1] = array[i];

                    arraySum[i] = t;
                    array[i] = r;
                }
            }
        }
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++ ){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
