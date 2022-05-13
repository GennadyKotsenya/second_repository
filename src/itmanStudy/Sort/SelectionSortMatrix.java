package itmanStudy.Sort;

public class SelectionSortMatrix {

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {5, 1},
                {5, 2},
                {2, 3},
                {1, 4},
        };

        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex][0] > a[j][0]) {
                    minIndex = j;
                }
            }
            int[] t = a[minIndex];
            a[minIndex] = a[i];
            a[i] = t;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
