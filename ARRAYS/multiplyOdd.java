public class multiplyOdd {
    public static void main(String[] args) {
        int [] arr = {20 , 5 , 6 , 60 , 9 , 11};

        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+ " ");
            if (arr[i]%2 == 0){
                arr[i] = arr[i] + 10;

        }
        else{
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("\n"+"Modified array:" );
        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
