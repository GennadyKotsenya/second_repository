package itmanStudy.DifferentSort;

public class SelectionSortDescend {
    public static void main(String[] args) {

        int[] arrayInts = new int[]{2, -1, 9, 1, -7, 2, 5};

        for(int i = 0; i < arrayInts.length; i++){
            int maxIndex = i;
            for (int j = i + 1; j < arrayInts.length; j++){
                if(arrayInts[maxIndex] < arrayInts[j]){
                    maxIndex = j;
                }
            }

            int t = arrayInts[maxIndex];

            arrayInts[maxIndex] = arrayInts[i];

            arrayInts[i] = t;

        }

        for(int i = 0; i < arrayInts.length; i++){
            System.out.print(arrayInts[i] + " ");
        }
    }
}
