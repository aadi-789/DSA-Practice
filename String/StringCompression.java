/*Time Complexity: O(N)
Space Complexity: O(N) */

public class StringCompression {
    public String transform(String S) {

        StringBuilder ans = new StringBuilder();

        int count = 1;

        for (int i = 1; i < S.length(); i++) {

            char prev = Character.toLowerCase(S.charAt(i - 1));
            char curr = Character.toLowerCase(S.charAt(i));

            if (prev == curr) {
                count++;
            } else {
                ans.append(count);
                ans.append(prev);
                count = 1;
            }
        }

        ans.append(count);
        ans.append(Character.toLowerCase(S.charAt(S.length() - 1)));

        return ans.toString();
    }
    public static void main(String[] args) {
        StringCompression solution = new StringCompression();
        String S = "aaabbc";
        String result = solution.transform(S);
        System.out.println(result);
    }
}
