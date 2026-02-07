public class maxOfElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 12, 2, 29, 14};
        int max = arr[0];
        //int max = Integer.MIN_VALUE;(if -ve numbers are also there in the array)
        for (int i = 0; i < arr.length; i++){
            if (arr [i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}
