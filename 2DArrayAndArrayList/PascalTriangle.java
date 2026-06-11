/* Pascal's Triangle 
T.C: O(n^2) S.C: O(n^2)*/

import java.util.*;

public class PascalTriangle {
    public List<List<Integer>> pascalsTriangle(int n ){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            ans.add(new ArrayList<>());
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    ans.get(i).add(1);
                }
                else{
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        List<List<Integer>> ans = pt.pascalsTriangle(5);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
}
