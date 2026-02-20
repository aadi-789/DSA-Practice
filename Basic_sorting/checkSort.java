public class checkSort {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 3, 4, 1, 2};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray)); // true
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray)); // false
    }
}