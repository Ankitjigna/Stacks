import java.util.*;
public class DuplicateParenthesis{
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){   // closing
                int count = 0;
                while(!s.isEmpty() && s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;  // duplicate
                }else{
                    s.pop();  // opening pair
                }
            }else{
                // opening
                s.push(ch);
            }
         }
         return false;
        
    }
    public static void main(String args[]){
        String str = "((a+b))"; // true
        String str1 = "((a+b)+c)"; // false
        System.out.println(isDuplicate(str1));
    }
}