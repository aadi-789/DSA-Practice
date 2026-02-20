/*Sorting technique - Bubble sort - basic sorting algorithm.
Approach :-  
    1. Repeatedly steps through the list.
  2. Compares adjacent elements and swaps them if they are in the wrong order.
  3. The pass through the list is repeated until the list is sorted.
  
  4. Time Complexity :- O((n-1)^2) in worst and average case.
                     :- O(n-1) in best case (when array is already sorted).
  5. Space Complexity :- O(1) as it is an in-place sorting algorithm.
  
   */



/*public class bubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;
        print(arr);
        for (int j=0 ; j<n-1 ; j++){
            for (int i = 0 ; i<n-1-j ; i++){  // n-1-j because after every pass last j elements are already sorted.it will be better optimization.
                if (arr[i] > arr[i+1]){
                    // swap both the elements.
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
                
            }
        } 
        print(arr);

    }
    
} */

    public class bubbleSort {
    public static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;
        print(arr);
        for (int j=0 ; j<n-1 ; j++){
            boolean isSorted = true; // optimization to check if array is already sorted.
            for (int i = 0 ; i < n-1 ; i++){ //reduces the no. of ops . checks whether the array is already sorted or not.
                if (arr[i]>arr[i+1]){
                    isSorted = false;
                    break;
                }
            }
           
            for (int i = 0 ; i<n-1-j ; i++){  
                
                if (arr[i] > arr[i+1]){
                    // swap both the elements.
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
                
            }
        } 
        print(arr);

    }
    
}
