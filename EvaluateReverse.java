import java.util.Deque;
import java.util.LinkedList;

public class EvaluateReverse {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList();
        for(String s : tokens){
            if("+".equals(s)){//+
                stack.push(stack.pop() + stack.pop());
            } else if("-".equals(s)){//-
                stack.push(-stack.pop() + stack.pop());
            } else if("*".equals(s)){//*
                stack.push(stack.pop() * stack.pop());
            } else if("/".equals(s)){//除
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else{//最终的结果
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();//pop the final result
    }
}
