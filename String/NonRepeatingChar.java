/*Problem Statement =   Given a string s consisting of lowercase English Letters. 
                        return the first non-repeating character in s. 
                        If there is no non-repeating character, return '$'. 
                        
  Time Complexity: O(n)
  Space Complexity: O(1)
  
  */
public class NonRepeatingChar {
    static char nonRepeatingChar(String s){
        int[] freq = new int[26];
        
        // Count the frequency of each character
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        // Find the first non-repeating character
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(freq[ch - 'a'] == 1){
                return ch;
            }
        }
        return '$'; // Return '$' if there is no non-repeating character
    }
    public static void main(String[] args) {
        String s = "hello";
        char result = nonRepeatingChar(s);
        if(result != '$'){
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There is no non-repeating character.");
        }
    }
}
