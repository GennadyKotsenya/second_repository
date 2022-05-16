package itmanStudy;

/*
Напишите функцию, которая принимает вещественное число,
и возвращает целое число округленное к ближайшему целому.
 */

public class MyRound {
    public static void main(String[] args) {

        System.out.println(round(2.3));
    }

    public static int round(double x) {

        double different = x - (int) x;
        if (different < 0) {
            different = -different;
        }

        int r;

        if (x < 0) {
            x = -x;

            if (different >= 0.5) {
                x++;
                r = (int) x;
                r = -r;
                return r;
            } else {
                r = (int) x;
                r = -r;
                return r;
            }

        } else {
            if (different >= 0.5) {
                x++;
                return (int) x;
            } else {
                return (int) x;
            }
        }
    }
}
