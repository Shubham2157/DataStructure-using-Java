package Stack;

public class MyStackExp {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack<>();
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
