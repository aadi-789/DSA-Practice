// binary search for the array which is sorted in the descending order.

public class descOrder {
    public static int binarySearch(int[] arr,int tar){
    //this code wont return the first index of the target 
    // if there are multiple occurrences of the target in the array. 
    // It can return any index of the target.
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int idx = -1;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]==tar){
                idx=mid;
                lo = mid+1;
            }
            else if (arr[mid]>tar){
                lo = mid+1;
            }
            else if (arr[mid]<tar){
                hi = mid-1;
            }
        }
        return idx;

    }
    /*code for the first occurrence in descending array
        int lo = 0,n = arr.length,hi = n-1,idx = -1;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]==tar){
                idx=mid;
                hi = mid-1;
            }
            else if (arr[mid]>tar){
                lo = mid+1;
            }
            else if (arr[mid]<tar){
                hi = mid-1;
            }
        }
        return idx;*/
    public static void main(String[] args) {
        int[] arr = {100,66,53,43,26,25,24,22,13,10,9, 7, 5, 3, 1,};
        int target = 26;
        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("The index of " + target + " is: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
