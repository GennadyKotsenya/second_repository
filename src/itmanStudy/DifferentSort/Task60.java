package itmanStudy.DifferentSort;

import java.util.Scanner;

/*
5
milk 2
sugar 2
bread 5
apple 4
orange 1

Дано N товаров. У каждого товара есть наименование Si и цена Pi.
Для простоты цену будет считать целым числом.
Вам надо отсортировать товары по возрастанию цены.
Товары с одинаковой ценной должны остаться
в таком же порядке относительно друг друга как были до сортировки.
 */
public class Task60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] arraySi = new String[n];
        int[] arrayPi = new int[n];
        for (int i = 0; i < n; i++){

            arraySi[i] = scanner.next();
            arrayPi[i] = scanner.nextInt();

        }

        for (int nn = arrayPi.length; nn > 1; nn--){
            for (int i = 1; i < nn; i++){
                if(arrayPi[i - 1] > arrayPi[i]){
                    int t = arrayPi[i - 1];
                    String s = arraySi[i  - 1];
                    arrayPi[i - 1] = arrayPi[i];
                    arraySi[i - 1] = arraySi[i];
                    arrayPi[i] = t;
                    arraySi[i] = s;
                }
            }
        }

        for (int i = 0; i < n; i++){

            System.out.println(arraySi[i]+ " " +arrayPi[i]);

        }

    }
}
