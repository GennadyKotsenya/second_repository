package itmanStudy.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 2, 4, 2};

        for (int n = a.length; n > 1; n--) {
            for (int i = 1; i < n; i++) {
                if (a[i - 1] > a[i]) {
                    int t = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = t;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
