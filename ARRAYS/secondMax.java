/* - you have to print the second largest element from the array.
   Approach - traverse through array  with 2 loops and find the max . find the second max element which is not the current max .  */


public class secondMax {
    public static void main(String[] args) {
        int[] arr = {4 , 10 , 10 , 3 , 6 , 8};
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];

            }
        }
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i]>sMax && arr[i]!=max){
                sMax = arr[i];
            }
        }
        System.out.println("The second maximum element in the array is: " + sMax);
    }
    
}
