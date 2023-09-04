import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStack {
    Queue<Integer> que1 = new ArrayDeque<>();
    Queue<Integer> que2 = new ArrayDeque<>();

    public void MyStack() {

    }

    public void push(int x) {
        while(que1.size() > 0){
            que2.add(que1.poll());
        }
        que1.add(x);
        while(que2.size() > 0){
            que1.add(que2.poll());
        }
    }

    public int pop() {
        return que1.poll();
    }

    public int top() {
        return que1.peek();
    }

    public boolean empty() {
        return que1.isEmpty();
    }
}
