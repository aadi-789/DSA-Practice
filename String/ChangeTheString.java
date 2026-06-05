// Given a string s, the task is to change the complete string to uppercase or lowercase depending on 
// the case of the first character.


//used builtin methods for the conversion of the string to uppercase and lowercase
public class ChangeTheString {
    
    String modify(String s) {
        char ch = s.charAt(0);
        
        if(ch >= 97 && ch <= 123){
            return s.toLowerCase();
        }
        return s.toUpperCase();
    }
    public static void main(String[] args) {
        ChangeTheString cts = new ChangeTheString();
        String s = "Hello World";
        System.out.println(cts.modify(s));
    }   
}

