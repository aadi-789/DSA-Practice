/*count how many numbers are negative
count how many numbers are positive
ignore 0
return the larger count
the array will be sorted
logn - complexity */

class maxposneg {

    // First index where value >= 0
    public int firstNonNegative(int[] nums) {

        int lo = 0, hi = nums.length - 1;
        int ans = nums.length;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (nums[mid] >= 0) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    // First index where value > 0
    public int firstPositive(int[] nums) {

        int lo = 0, hi = nums.length - 1;
        int ans = nums.length;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (nums[mid] > 0) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }

    public int maximumCount(int[] nums) {

        int neg = firstNonNegative(nums);

        int pos = nums.length - firstPositive(nums);

        return Math.max(neg, pos);
    }
    public static void main(String[] args) {

        maxposneg sol = new maxposneg();

        int[] nums = {-2, -1, -1, 1, 2, 3};

        System.out.println(sol.maximumCount(nums));
    }
}