/*Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
The returned integer should be non-negative as well.
logn -complexity */

public class sqrt {
    int floorSqrt(int x){
        int lo=0,hi=x;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            long square = (long)mid*mid;
            if(square==x)return mid;
            else if(square>x)hi=mid-1;
            else lo=mid+1;
        }
        return hi;
    }
    public static void main(String[] args) {
        int x = 11;
        sqrt s = new sqrt();
        System.out.println("floor of sqrt of x is:");
        System.out.println(s.floorSqrt(x));
    }
    
}
