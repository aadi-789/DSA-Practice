/*WaveArray problem . you have to put the elements of the array in a wave like pattern. 
one small element followed by a large element and again small element and so on. in the lexicographical order.
  Approach = Sort the array and swap adjacent elements. */

public class waveArray {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 10, 7, 20};
        int n = arr.length;

        // Sort the array
        java.util.Arrays.sort(arr);

        // Swap adjacent elements to form wave pattern
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Print the wave array
        System.out.print("Wave Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

}
