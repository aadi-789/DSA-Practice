public class zeroesToEnd {
    public static void print(int[] arr) {
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr[] = {5, 4 ,0 , 0 ,3, 2, 1 , 0};
        int n = arr.length;
        print(arr);
        for (int j=0 ; j<n-1 ; j++){
            for (int i = 0 ; i<n-1-j ; i++){  // n-1-j because after every pass last j elements are already sorted.it will be better optimization.
                if (arr[i] == 0 ){
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
