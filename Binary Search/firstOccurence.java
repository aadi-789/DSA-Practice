//Given a sorted array arr[] and an integer k, 
// find the position(0-based indexing) at which k is present in the array using binary search. 
// If k doesn't exist in arr[] return -1.   
//Note: If multiple occurrences are there, please return the smallest index.
//time-complexity: O(log n) = Binary search 


public class firstOccurence {

    public int binarySearch(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1, idx = -1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (arr[mid] == tar) {
                idx = mid;
                hi = mid - 1;
            }
            else if (arr[mid] < tar) {
                lo = mid + 1;
            }
            else {
                hi = mid - 1;
            }
        }

        return idx;
    }

    public static void main(String[] args) {

        firstOccurence fo = new firstOccurence();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int ans = fo.binarySearch(arr, 2);

        if (ans != -1) {
            System.out.println("Element found at index: " + ans);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}