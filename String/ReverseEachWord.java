public class ReverseEachWord {
    String reverseEachWord(String s){
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<words.length; i++){
            for(int j =words[i].length()-1; j>=0; j--){
                sb.append(words[i].charAt(j));
            }
            if(i != words.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        ReverseEachWord obj = new ReverseEachWord();
        String s = "Say Hi to World";
        System.out.println(obj.reverseEachWord(s));
    }
}
