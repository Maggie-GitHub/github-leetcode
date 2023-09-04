import java.util.ArrayDeque;
import java.util.Queue;
//this method is using two queues to finish the task
//first queue send size个元素 to queue2
//then add the x to queue1
//then queue2 give back size个元素 to que1
//finally, the one comes out is what we want - x

public class ImplementStack {
    Queue<Integer> que1 = new ArrayDeque<>();
    Queue<Integer> que2 = new ArrayDeque<>();

    public void MyStack() {

    }

    public void push(int x) {
        while(que1.size() > 0){//size个元素 to queue2
            que2.add(que1.poll());
        }
        que1.add(x);//add the x to queue1
        while(que2.size() > 0){
            que1.add(que2.poll());//size个元素 to queue1
        }
    }

    public int pop() {
        return que1.poll();//same as pop for stack
    }

    public int top() {
        return que1.peek();
    }

    public boolean empty() {
        return que1.isEmpty();
    }
}
