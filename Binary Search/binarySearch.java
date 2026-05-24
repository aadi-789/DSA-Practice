//Given an array of integers nums which is sorted in ascending order, 
// and an integer target, write a function to search target in nums. 
// If target exists, then return its index. Otherwise, return -1.
// //You must write an algorithm with O(log n) runtime complexity.

public class binarySearch {
    public int search(int[] arr, int target){
        int n = arr.length;
        int lo = 0, hi = n-1;

        while(lo <= hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }   
        }
        return -1;

    }

    public static void main(String[] args) {
        binarySearch bs = new binarySearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = bs.search(arr, target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
