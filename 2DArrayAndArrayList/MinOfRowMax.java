// Given a 2D array of integers, 
// find the minimum value among the maximum values of each row.

public class MinOfRowMax {
    public int minOfRowMaximums(int[][] mat) {

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < mat.length; i++) {

            int rowMax = mat[i][0];

            for (int j = 1; j < mat[0].length; j++) {
                if (mat[i][j] > rowMax) {
                    rowMax = mat[i][j];
                }
            }

            if (rowMax < answer) {
                answer = rowMax;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        MinOfRowMax obj = new MinOfRowMax();
        System.out.println(obj.minOfRowMaximums(arr));
    }
}
