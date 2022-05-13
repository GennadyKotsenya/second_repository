public class Search {
    public static void main(String[] args) {

        int[] arrayNumbers = {1, 2, 5, 8, 13, 19, 23, 34, 51, 67};

//        System.out.println(linearSearch(arrayNumbers,54));
//        System.out.println(linearSearch(arrayNumbers,2));

//        System.out.println(binarySearch(arrayNumbers, 4));
//        System.out.println(binarySearch(arrayNumbers, 51));

        System.out.println(binarySearchRecursion(arrayNumbers, 4, 0,
                arrayNumbers.length - 1));
        System.out.println(binarySearchRecursion(arrayNumbers, 51, 0,
                arrayNumbers.length - 1));
    }

    public static int linearSearch(int[] arrayNumbers, int x) {

        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] == x)
                return i;
        }
        return -1;
    }


    public static int binarySearch(int[] arrayNumbers, int x) {

        int low = 0;
        int high = arrayNumbers.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (x < arrayNumbers[middle])
                high = middle - 1;
            else if (x > arrayNumbers[middle])
                low = middle + 1;
            else
                return middle;
        }

        return -1;
    }

    public static int binarySearchRecursion (int[] arrayNumbers,
                                             int x, int low, int high) {

        int middle = low + (high - low) / 2;

        if (low > high) {
            return -1;
        }

        if (x < arrayNumbers[middle]){
            return binarySearchRecursion(arrayNumbers, x, low, middle - 1);
        } else if (x > arrayNumbers[middle]) {
            return binarySearchRecursion(arrayNumbers, x, middle + 1, high);
        } else {
            return middle;
        }

    }
}
