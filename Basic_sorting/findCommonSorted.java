import java.util.Arrays;

public class findCommonSorted {

    public static void findCommonSorted(int[] arr1, int[] arr2) {
    int i = 0, j = 0;
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] == arr2[j]) {
            System.out.print(arr1[i] + " ");
            i++;
            j++;
        } else if (arr1[i] < arr2[j]) {
            i++;
        } else {
            j++;
        }
    }
}

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6, 3, 6};
        int[] arr2 = {8, 3, 2, 7};
        System.out.println("Common elements in sorted arrays:");
        findCommonSorted(arr1, arr2);
    } 
}