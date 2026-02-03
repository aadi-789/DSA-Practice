/* - you have to reverse an array.
   Approach - swap first and last elements, then move towards the center of the array until all elements are swapped.
   use two pointer approach. */

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {5 , 6 , 9 , 45 , 3 , 4 , 0};
        /* for (int i =0 ; i<n/2 ; i++)
        int temp = arr[i];
        arr[i] = arr[n-1-i];
        arr[n-1-i] = temp;
         */
        
        int n = arr.length;
        int i = 0; int j = n-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
            
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
