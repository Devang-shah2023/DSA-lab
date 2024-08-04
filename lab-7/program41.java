import java.util.*;

public class program41 {
    public static boolean isMatchingPair(char open, char close){
        return(open=='{'&& close=='}')||
              (open=='('&& close==')')||
              (open=='['&& close==']');
    }
    public static boolean isBalanced(String str){
        Stack<Character> stack= new Stack<>();

        for(char ch: str.toCharArray()){
            if (ch=='{'|| ch=='('|| ch=='[') {
                stack.push(ch);
                
            }
            else if(ch=='}'|| ch==')'|| ch==']'){
                if (stack.isEmpty()) {
                    return false;
                    
                }
                char last= stack.pop();

            }
        }

    }
    
}
