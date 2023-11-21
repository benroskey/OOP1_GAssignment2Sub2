package utility;

public class MyDLLNode<E> {
    private E element;
    private MyDLLNode<E> prev;
    private MyDLLNode<E> next;

    public MyDLLNode() {
        this.element = null;
        this.prev = null;
        this.next = null;
    }

    public MyDLLNode(E elem) {
        this.element = elem;
        this.prev = null;
        this.next = null;
    }
 
    public MyDLLNode(E elem, MyDLLNode<E> prev, MyDLLNode<E> next) {
        this.element = elem;
        this.prev = prev;
        this.next = next;
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E elem) {
        this.element = elem;
    }

    public MyDLLNode<E> getPrev() {
        return this.prev;
    }

    public void setPrev(MyDLLNode<E> prev) {
        this.prev = prev;
    }

    public MyDLLNode<E> getNext() {
        return this.next;
    }

    public void setNext(MyDLLNode<E> next) {
        this.next = next;
    }
}
