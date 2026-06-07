import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if(s1.length() != s2.length()){
            System.out.println(false);
            return;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
