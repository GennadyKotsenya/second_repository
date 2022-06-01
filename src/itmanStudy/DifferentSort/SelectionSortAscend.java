package itmanStudy.DifferentSort;

public class SelectionSortAscend {
    public static void main(String[] args) {

        int[] a = new int[]{1, 5, 2, 4, 2};

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            int t = a[minIndex];
            a[minIndex] = a[i];
            a[i] = t;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);        // 1, 2, 2, 4, 5
        }

    }
}
