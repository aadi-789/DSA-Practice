public class PrintAllSubString {
    //between 2 index
    /* String substring(String S, int L, int R) {

       StringBuilder sb = new StringBuilder();
       
       for(int i = L ; i<R+1; i++){
           sb.append(S.charAt(i));
       }
       return sb.toString();
    } */

       //print all substring
         void printAllSubString(String S) {
          for(int i = 0; i<S.length(); i++){
                for(int j = i; j<S.length(); j++){
                 System.out.println(S.substring(i, j+1));
                }
          }
         }
        public static void main(String[] args) {
            PrintAllSubString obj = new PrintAllSubString();
            String S = "abc";
            obj.printAllSubString(S);
        }
}
