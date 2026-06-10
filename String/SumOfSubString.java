public class SumOfSubString {
    public static void main(String[] args) {
        String S = "123";
        int sum = 0;
        // for(int i = 0; i<S.length(); i++){
        //     for(int j = i; j<S.length(); j++){
        //         String subString = S.substring(i, j+1);
        //         sum += Integer.parseInt(subString);
        //     }
        // }
        // System.out.println(sum);

        for(int i = 0; i<S.length(); i++){
            int num = 0;
            for(int j = i; j<S.length(); j++){
                num = num*10 + (S.charAt(j) - '0');
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
