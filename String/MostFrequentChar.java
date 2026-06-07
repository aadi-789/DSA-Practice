import java.util.*;

public class MostFrequentChar {
    static char mostFrequentChar(String s){
        int n = s.length();
        int maxFreq = 0;char ans = s.charAt(0);
        //Method 1 = Breute Force(T.C = O(n^2) S.C = O(1))
        // for(int i = 0; i<n; i++){
        //     int freq = 1;
        //     char ch = s.charAt(i);

        //     for(int j = i+1; j<n; j++){
        //         if(s.charAt(j) == ch)freq++;
        //     }

        //     if(freq>maxFreq){
        //         maxFreq = freq;
        //         ans = ch;
        //     }
        //     else if(freq == maxFreq && ch<ans){
        //         ans = ch;
        //     }
            

        // }
        // return ans;

        //Method 2 = Sliding Window(T.C = O(nlogn) S.C = O(n))
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        int i = 0, j = 0;

        while (j < n) {

            if (arr[i] == arr[j]) {
                j++;
            } else {

                int freq = j - i;

                if (freq > maxFreq) {
                    maxFreq = freq;
                    ans = arr[i];
                } else if (freq == maxFreq && arr[i] < ans) {
                    ans = arr[i];
                }

                i = j;
            }
        }

        // Process last group
        int freq = j - i;

        if (freq > maxFreq) {
            ans = arr[i];
        } else if (freq == maxFreq && arr[i] < ans) {
            ans = arr[i];
        }

        return ans;
    


        //Method 3 = (T.C = O(n) S.C = O(n))
        // int[] freq = new int[26];
        // for(int i = 0; i<n; i++){
        //     char ch = s.charAt(i);
        //     freq[ch - 'a']++;
        // }
        
        // for(int i = 0; i<26; i++){
        //     if(freq[i] > maxFreq){
        //         maxFreq = freq[i];
        //         ans = (char)(i+97);

        //     }
        // }
        // return ans;
    }
    public static void main(String[] args) {
        String s = "hello";
        char result = mostFrequentChar(s);
        System.out.println("The most frequent character is: " + result);
    }
}
