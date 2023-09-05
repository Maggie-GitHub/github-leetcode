import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            } else if(s.charAt(i) == '['){
                stack.push(']');
            } else if(s.charAt(i) == '{'){
                stack.push('}');
            } else if(stack.empty() || stack.peek() != s.charAt(i)){
                return false;
            } else{
                stack.pop();
            }
        }
        return stack.empty();
    }
}
