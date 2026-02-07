public class minOfArray {
    public static void main(String[] args) {
        int[] arr = {1 , 5 , -6 , 2 , 8};
        int min = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if (arr[i]<min){
                min = arr[i];
                
            }
        }
        System.out.println(min);
    }
}
