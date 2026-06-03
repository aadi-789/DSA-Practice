public class rotatedSorted {
    int Search(int[] arr, int tar) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == tar) return mid;
            if (arr[lo] <= arr[mid]) {//left sorted
                if(arr[lo]<=tar && tar <= arr[mid]){
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            else{//right sorted
                if(arr[mid]<=tar && tar <=arr[hi]){
                    lo=mid+1;

                }
                else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        rotatedSorted r = new rotatedSorted();
        int[] arr = {4,5,6,7,0,1,2};
        int tar = 0;
        System.out.println(r.Search(arr, tar));
    }
}
