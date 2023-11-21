package utility;

import java.util.NoSuchElementException;

import adt.Iterator;
import adt.ListADT;

public class MyDLL<E> implements ListADT<E>, Iterator<E> {
    private MyDLLNode<E> head;
    private MyDLLNode<E> tail;

    public MyDLL() {
        this.head = this.tail = null;
    }

    public MyDLL(E elem) {
        this.head = this.tail = new MyDLLNode<E>(elem);
    }

    public MyDLL(MyDLLNode<E> head, MyDLLNode<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyDLLNode<E> getHead() {
        return this.head;
    }

    public void setHead(MyDLLNode<E> head) {
        if (this.tail == null) {
            this.head = this.tail = head;
        } else {
            MyDLLNode<E> temp = new MyDLLNode<>();
            temp.setNext(head);
            head.setPrev(temp);
            head = temp;
        }
    }

    public MyDLLNode<E> getTail() {
        return this.tail;
    }

    public void setTail(MyDLLNode<E> tail) {
        if (this.tail == null) {
            this.head = this.tail = head;
        } else {
            MyDLLNode<E> temp = new MyDLLNode<>();
            tail.setNext(temp);
            temp.setPrev(tail);
            tail = temp;
        }
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

    @Override
    public E next() throws NoSuchElementException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean add(E toAdd) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        for (MyDLLNode<E> curr = this.head; curr != null; curr = curr.getNext()) {
            if (count == index) {
                return curr.getElement();
            }
            count++;
        }
        return null;
    }

    @Override
    public E remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        for (MyDLLNode<E> curr = this.head; curr != null; curr = curr.getNext()) {
            if (count == index) {
                E temp = curr.getElement();
                curr.getPrev().setNext(curr.getNext());
                curr.getNext().setPrev(curr.getPrev());
                return temp;
            }
            count++;
        }
        return null;
    }

    @Override
    public E remove(E toRemove) throws NullPointerException {
        for (MyDLLNode<E> curr = this.head; curr != null; curr = curr.getNext()) {
            if (curr.getElement().equals(toRemove)) {
                E temp = curr.getElement();
                curr.getPrev().setNext(curr.getNext());
                curr.getNext().setPrev(curr.getPrev());
                return temp;
            }
        }
        throw new NullPointerException();
    }

    @Override
    public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        int count = 0;
        for (MyDLLNode<E> curr = this.head; curr != null; curr = curr.getNext()) {
            if (count == index) {
                E temp = curr.getElement();
                curr.setElement(toChange);
                return temp;
            }
            count++;
        }
        throw new NullPointerException();
    }

    @Override
    public boolean isEmpty() {
        if (this.head == this.tail && this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(E toFind) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public E[] toArray(E[] toHold) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}
