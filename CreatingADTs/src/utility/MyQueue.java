package utility;

import java.util.NoSuchElementException;

import adt.Iterator;
import adt.QueueADT;

public class MyQueue<E> implements QueueADT<E>, Iterator<E> {
    private MyDLL<E> list;

    public MyQueue() {
        this.list = new MyDLL<E>();
    }

    @Override
    public void enqueue(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException();
        }
        this.list.add(toAdd);
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException();
        }
        E temp = this.list.get(0);
        this.list.remove(0);
        return temp;
    }

    @Override
    public E peek() throws NoSuchElementException {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.list.get(0);
    }

    @Override
    public void dequeueAll() {
        this.list.clear();
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public boolean equals(QueueADT<E> that) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equals'");
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public E[] toArray(E[] holder) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }

    @Override
    public boolean isFull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
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
}
