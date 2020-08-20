package Stack;

import LinkedList.MyLinkedList;

public class MyStack<E> {

    private MyLinkedList<E> ll = new MyLinkedList<>();

    void push(E e){
        ll.add(e);
    }

    E pop() throws Exception{
        if (ll.isEmpty()){
            throw new  Exception("Popping out from an empty stack not allowed");
        }
        return ll.lastRemove();
    }
    E peek() throws Exception {
        if (ll.isEmpty()){
            throw new  Exception("Peeking out from an empty stack not allowed");
        }
        return ll.getLast();
    }
}
