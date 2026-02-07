public class missingInArray {
    public static void main(String[] args) {
        int[] arr = {1, 3 , 2 , 4 , 6};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        int missingNumber = sum - arrSum;
        System.out.println("The missing number is: " + missingNumber);
    }   
}// change long according to the constraints.
//// If the numbers are very large, use long data type to avoid overflow.
/// return in int converting from long
/// 
