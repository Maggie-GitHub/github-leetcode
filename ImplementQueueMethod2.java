import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueMethod2 {
    class MyStack {
        Deque<Integer> queue;
        public MyStack() {
            queue = new ArrayDeque<>();
        }

        public void push(int x) {
            queue.addLast(x);
        }

        public int pop() {
            int size = queue.size();
            size--;//i need to keep the last element
            while(size-- > 0){
                queue.addLast(queue.peekFirst());
                queue.pollFirst();
            }
            int res = queue.pollFirst();
            return res;
        }

        public int top() {
            return queue.peekLast();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
