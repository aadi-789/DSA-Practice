/*time = n+nlogn , space = n  */
public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        boolean result = false;
        int i= 0, j=arr.length-1;
        while(i<j){
            if (arr[i]+arr[j] == target) {
                result = true;
                break;
            }
            else if (arr[i]+arr[j]<target)i++;
            else j--;

        }
        System.out.println(result);
    }
    
}
