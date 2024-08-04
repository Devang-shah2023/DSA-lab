import java.util.*;

public class program40 {
    public static boolean StringChecker(String str){
        Stack<Character> stack= new Stack<>();
        int length= str.length();

        for(int i=0; i<length; i++){
            char ch= str.charAt(i);

            if (ch=='a') {
                stack.push(ch);
                
            }
            else if(ch=='b'){
                if (stack.isEmpty()|| stack.pop()!='a') {
                    return false;
                    
                }
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a^ib^i string to check pattern:");
        String input= scanner.nextLine();

        if (StringChecker(input)) {
            System.out.println("It is in given form:");
            
        }
        else{
            System.out.println("It is not of given form");
        }
    }
}
