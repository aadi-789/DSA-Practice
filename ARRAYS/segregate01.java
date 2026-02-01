/* segregate01 problem . you have to put all 0's on the left and all 1's on the right.there will only be 0s and 1s in array
   Approach = Use two pointers to swap 0's and 1's */


public class segregate01 {
    static void segregate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }
            while (arr[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0, 1};
        System.out.print("Original Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        segregate(arr);

        System.out.print("\nArray after segregation: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}