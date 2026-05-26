//The array has at least 3 elements.
/*The peak can never be the very first element (index 0) or the very last element (index arr.length - 1). 
If the first element were the peak, there would be no upward slope. 
If the last element were the peak, there would be no downward slope.
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
 */
public class mountainArray {
    public int PeakIndexInMountainArray(int[] arr) {
        int lo = 1;
        int hi = arr.length - 2;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return 1; 
    }
    public static void main(String[] args) {
        mountainArray solution = new mountainArray();
        int[] arr = {0, 2, 1, 0};
        int peakIndex = solution.PeakIndexInMountainArray(arr);
        System.out.println("Peak Index: " + peakIndex); // Output: Peak Index: 1
    }
}
