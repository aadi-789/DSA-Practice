/* Given two integers arrays a[] and b[] .Return the list of elements common to both the lists and
 return the list in sorted order. Duplicates may be there in the output list.
Approach = Use two pointers to traverse both the arrays and find common elements. 
 */
import java.util.Arrays;
public class commonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        int[] b = {2, 3, 5, 7, 15, 14 , 6 ,6, 3 , 8};
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0;
        System.out.print("Common elements: ");
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
    
}
