/*You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right]. */

public class Vowels {
    public static int countVowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left ; i<right+1; i++){
            String s = words[i];
            char first = s.charAt(0);
            char last = s.charAt(s.length()-1);
            if((first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') && (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')){
                count++;
            } 
        }
        return count;
    }
    public static void main(String[] args) {
        String[] words = {"aba","bcb","ece","aa","e"};
        int left = 0;
        int right = 2;
        System.out.println(countVowelStrings(words, left, right));
    }
}
