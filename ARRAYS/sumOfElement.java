/* sumOfElement array problem
approach = put initially sum = 0 and iterate through the array to calculate the sum */

public class sumOfElement {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 16, 25};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
