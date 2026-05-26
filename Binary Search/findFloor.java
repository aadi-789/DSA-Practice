public class findFloor {
    static int floorSorted(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        int idx = -1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;           
            if (arr[mid] > x) {
                hi = mid-1;
            } 
            else {
                idx = mid;
                lo = mid + 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;
        System.out.println("index of floor of x is:");
        System.out.println(floorSorted(arr, x));
    }
}
