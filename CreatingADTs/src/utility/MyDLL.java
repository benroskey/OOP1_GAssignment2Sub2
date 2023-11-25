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

    private MyDLLNode<E> current = head; // Iterator state

    @Override
    public boolean hasNext() {
        // Checks if there are more elements to iterate over in the list.
        // 'current' points to the current node in the iteration. If it's not null, it means there are more elements.
        return current != null;
    }
    

    @Override
    public E next() throws NoSuchElementException {
        // Retrieves the next element in the iteration and advances the iterator.
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the list");
        }
        E element = current.getElement();
        current = current.getNext();
        return element;
    }
    

    @Override
    public int size() {
        // Counts the number of elements in the list.
        int count = 0;
        MyDLLNode<E> temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }
    

    @Override
    public void clear() {
        // Clears the list by setting head and tail to null.
        // This effectively removes all elements from the list.
        head = tail = null;
    }
    
    @Override
    public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot add null element");
        }
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    
        MyDLLNode<E> newNode = new MyDLLNode<>(toAdd);
    
        if (index == 0) {
            if (head == null) { // List is empty
                head = tail = newNode;
            } else { // Insert at the beginning
                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            }
        } else if (index == size()) { // Insert at the end
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        } else { // Insert in the middle
            MyDLLNode<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            newNode.setNext(current.getNext());
            newNode.setPrev(current);
            current.getNext().setPrev(newNode);
            current.setNext(newNode);
        }
    
        return true;
    }
    

    @Override
    public boolean add(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot add null element");
        }
        MyDLLNode<E> newNode = new MyDLLNode<>(toAdd);
        if (head == null) { // List is empty
            head = tail = newNode;
        } else { // Add to the end
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        return true;
    }
    

    @Override
    @SuppressWarnings("unchecked")
    public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot add null list");
        }
        E[] elements = (E[]) toAdd.toArray(); // Convert to array
        for (E element : elements) {
            add(element); // Using the add(E toAdd) method for each element
        }
        return true;
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
