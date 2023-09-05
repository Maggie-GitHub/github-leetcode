import java.util.ArrayDeque;

public class RomoveDuplicates {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(deque.isEmpty() || deque.peek() != ch){
                deque.push(ch);
            } else {
                deque.pop();
            }
        }
        String result = "";
        while(!deque.isEmpty()){
            result = deque.pop() + result;
        }
        return result;
    }
}
