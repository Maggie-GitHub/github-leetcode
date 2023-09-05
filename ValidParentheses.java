import java.util.Stack;
//there are only three cases in this question
//1: ({[]}((( list is empty, stack still left some elements, so false
//2: ({)}  stack's peek won't match the chatAt, so false
//3: ({[]}))) element left, but stack empty, so false
public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){//if it has odd numbers of element, it must be false
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
