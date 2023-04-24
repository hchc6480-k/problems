package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    /**
     *
     * Queue : first int first out
     *
     */
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        System.out.println("pop:" + stack.top());
        System.out.println("top:" + stack.pop());
        System.out.println("empty:" + stack.empty());

    }

    public static class MyStack {
        Queue<Integer> q1;
        Queue<Integer> q2;

        public MyStack() {
            this.q1 = new LinkedList<>();
            this.q2 = new LinkedList<>();
        }

        public void push(int x) {
            q1.add(x);
        }

        public int pop() {
            while(q1.size()>1){
                q2.add(q1.remove());
            }

            int pop = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return pop;
        }

        public int top() {
            while(q1.size()>1){
                q2.add(q1.remove());
            }

            int top = q1.peek();
            q2.add(q1.remove());
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return top;
        }

        public boolean empty() {
            if (q1.isEmpty()) return true;
            return false;
        }

    }
}
