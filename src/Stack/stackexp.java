package Stack;

import java.util.Stack;

public class stackexp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(24);
        stack.push(36);
        stack.push(48);

        int popped = stack.pop();

        int peeked = stack.peek();

        System.out.println(popped);
        System.out.println(peeked);
    }
}
