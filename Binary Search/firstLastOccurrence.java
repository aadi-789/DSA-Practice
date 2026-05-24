//Given an array of integers nums sorted in non-decreasing order, 
// find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.


import java.util.ArrayList;

public class firstLastOccurrence {

    // First Occurrence
    public static int firstOccurrence(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1;
        int idx = -1;

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

    // Last Occurrence
    public static int lastOccurrence(int[] arr, int tar) {

        int lo = 0, hi = arr.length - 1;
        int idx = -1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (arr[mid] == tar) {
                idx = mid;
                lo = mid + 1;
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

        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6};

        int tar = 5;

        ArrayList<Integer> list = new ArrayList<>();

        int first = firstOccurrence(arr, tar);
        int last = lastOccurrence(arr, tar);

        list.add(first);
        list.add(last);

        System.out.println(list);
    }
}