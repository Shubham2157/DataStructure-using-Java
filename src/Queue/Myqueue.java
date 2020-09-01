package Queue;


import LinkedList.MyLinkedList;

public class Myqueue<E> {
    private MyLinkedList.Node<E> head,rear;

    public void enqueue(E e){
        MyLinkedList.Node<E> toAdd = new MyLinkedList.Node<>(e);

        if (head == null){
            head = rear = toAdd;
            return;
        }

        rear.next = toAdd;
        rear = rear.next;
    }
    public void peek(){
        System.out.print(head.data);
    }

    public E dequeue(){

        if (head ==  null){
            return null;
        }

        MyLinkedList.Node<E> temp = head;
        head = head.next;

        if (head == null){
            rear = null;
        }

        return temp.data;
    }


}
