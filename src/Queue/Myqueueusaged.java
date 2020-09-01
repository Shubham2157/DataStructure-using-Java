package Queue;

public class Myqueueusaged {
    public static void main(String[] args) {
        Myqueue<Integer> mq = new Myqueue<>();
        for(int i = 1; i<=10; i++){
            mq.enqueue(2*i);
        }
        mq.peek();
        for(int i = 1; i<=10; i++){
            System.out.print(" "+mq.dequeue() + " ");

        }
    }
}
