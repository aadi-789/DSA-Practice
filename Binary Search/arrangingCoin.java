public class arrangingCoin {
    int arrangeCoins(int n) {
        int lo = 0 , hi = n;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            long sum = (long)mid*(mid+1)/2;
            if(sum == n) return mid;
            else if(sum < n) lo = mid+1;
            else hi = mid-1;
        }
        return hi;
    }
    public static void main(String[] args) {
        arrangingCoin a = new arrangingCoin();
        int n = 5;
        System.out.println(a.arrangeCoins(n));
    }
}
