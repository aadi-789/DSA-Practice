/* - you have to left rotate an array by k positions.
   Approach - reverse first k elements, then reverse the remaining n-k elements, finally reverse the whole array. */
 


public class rotateArray {

    // Method to reverse part of array
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method to left rotate array by k positions
    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;   // handle k > n

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.print("Original Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        leftRotate(arr, k);

        System.out.print("\nArray after Left Rotation by " + k + ": ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


