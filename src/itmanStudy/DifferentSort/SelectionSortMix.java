package itmanStudy.DifferentSort;

import java.util.Scanner;
/*
8
2 -1 9 1 -7 2 5 0

Дана последовательность чисел из N элементов. N - четное.
Вывести последовательность чисел из N / 2 элементов,
на первом месте которой стоит минимальный + максимальный элемент,
на втором второй по минимальности + второй по максимальности элемент и т.д.
 */

public class SelectionSortMix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arrayMinInts = new int[n];
        int[] arrayMaxInts = new int[n];

        for(int i = 0; i < n; i++){
            arrayMinInts[i] = scanner.nextInt();
            arrayMaxInts[i] = arrayMinInts[i];

        }

        for(int i = 0; i < arrayMaxInts.length; i++){
            int maxIndex = i;
            for (int j = i + 1; j < arrayMaxInts.length; j++){
                if(arrayMaxInts[maxIndex] < arrayMaxInts[j]){
                    maxIndex = j;
                }
            }

            int t = arrayMaxInts[maxIndex];

            arrayMaxInts[maxIndex] = arrayMaxInts[i];

            arrayMaxInts[i] = t;

        }

        for(int i = 0; i < arrayMinInts.length; i++){
            int minIndex = i;
            for (int j = i + 1; j < arrayMinInts.length; j++){
                if(arrayMinInts[minIndex] > arrayMinInts[j]){
                    minIndex = j;
                }
            }

            int t = arrayMinInts[minIndex];

            arrayMinInts[minIndex] = arrayMinInts[i];

            arrayMinInts[i] = t;

        }


        for(int i = 0; i < arrayMaxInts.length; i++){
            System.out.print(arrayMaxInts[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < arrayMinInts.length; i++){
            System.out.print(arrayMinInts[i] + " ");
        }

        System.out.println();

        for(int i = 0; i < n/2; i++){
            System.out.print((arrayMinInts[i] + arrayMaxInts[i]) + " ");
        }


    }
}

