import java.util.ArrayDeque;

public class RomoveDuplicates {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if(deque.isEmpty() || deque.peek() != ch){
                //if deque is empty, or the top element in deque doesn't match with the ch
                deque.push(ch);//then add element into deque
            } else {
                deque.pop();//if matches, pop
            }
        }
        String result = "";
        while(!deque.isEmpty()){//stop when the deque is empty
            result = deque.pop() + result;//add until empty
        }
        return result;
    }
}
