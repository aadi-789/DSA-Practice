// problem statement : Given a 2D matrix mat[][], identify any peak element within the matrix.

// An element is considered a peak if it is greater than or equal to its four immediate neighbors: 
// top, bottom, left, and right. 
// For corner and edge elements, 
// any missing neighbors are treated as having a value of negative infinity.
// Time Complexity : O(n × m)
// Space Complexity :  O(1)


public class maxMIn2DArray {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                int top = (i > 0) ? mat[i - 1][j] : Integer.MIN_VALUE;
                int bottom = (i < n - 1) ? mat[i + 1][j] : Integer.MIN_VALUE;
                int left = (j > 0) ? mat[i][j - 1] : Integer.MIN_VALUE;
                int right = (j < m - 1) ? mat[i][j + 1] : Integer.MIN_VALUE;

                if (mat[i][j] >= top &&
                    mat[i][j] >= bottom &&
                    mat[i][j] >= left &&
                    mat[i][j] >= right) {

                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
    
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        maxMIn2DArray obj = new maxMIn2DArray();
        int[] res = obj.findPeakGrid(arr);
        System.out.println("Peak element is at index: [" + res[0] + "," + res[1] + "]");
    }
}
