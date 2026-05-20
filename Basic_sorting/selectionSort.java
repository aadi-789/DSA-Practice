/*selection sort - find the min element from the array 
  and swap with the first element do this process repeatedly to get the array sorted.
  Time complexity = O(n^2) in all cases as we have to traverse the whole array to find the min element.
  space complexity = O(1)  */



public class selectionSort {

      // Helper method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            // Optimization: Only swap if a new minimum was actually found
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

  

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};
        System.out.println("Original Array:");
        printArray(data);

        selectionSort(data);

        System.out.println("Sorted Array:");
        printArray(data);
    }
}
