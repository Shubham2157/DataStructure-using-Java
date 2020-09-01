package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=10; i++){
            q.add(2*i);
        }
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
