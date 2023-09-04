import java.util.ArrayDeque;
import java.util.Deque;
//this is using one queue to solve the problem
//first, know the size and size-1
//send size - 1个 element to the end of itself
//add the element x
//poll the answer
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
                queue.pollFirst();//why this line of code
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
