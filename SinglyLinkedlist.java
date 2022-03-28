/**
 * Created by LENOVO ALMAZEN on 06/02/2022.
 */
public class SinglyLinkedlist<E> {

Node<E> head=null;
    Node<E> tail=null;
     private int size=0;


    public SinglyLinkedlist() {
    }
public boolean isEmpty(){
    return size==0;
}
 public int size()  {
     return size;
 }
public E first(){
    if (isEmpty())return null;
    return head.getElement();
}

    public E last(){
        if (isEmpty())return null;
        return tail.getElement();
    }

public void addFirst(E element){
    head=new Node<E>(element,head);
    if(size()==0)
        tail=head;
    size++;
}
public E removFirst(){
    if (isEmpty())return null;
    E del=head.getElement();
    head=head.getNext();
    size--;
    if(size==0)
        tail=null;
    return del;
}
    public void addlast(E element){
        Node<E> x=new Node<E>(element,null);
        if(size()==0)
            head=x;
        else
            tail.setNext(x);
        size++;
    }






    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }
    }


}
