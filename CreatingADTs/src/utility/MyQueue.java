package utility;

import java.util.NoSuchElementException;

import adt.Iterator;
import adt.QueueADT;

public class MyQueue<E> implements QueueADT<E>, Iterator<E> {
    private MyDLL<E> list;

    /**
     * Constructs an empty list with an initial capacity of ten.
     * 
     * @param none
     * @return none
     * @throws none
     * @postcondition none
     * @precondition none
     * @complexity O(1)
     */
    public MyQueue() {
        this.list = new MyDLL<E>();
    }

    /**
     * Enqueue will place the added item at the last position in the queue. This
     * method will not allow <code>null</code> values to be added to the Queue.
     * 
     * @param toAdd the item to be added to the Queue.
     * @throws NullPointerException raised when a <code>null</code> object is
     *                              placed in the Queue.
     * @precondition the item is not null.
     * @postcondition the item is added to the end of the queue and the size is
     *                increased by 1.
     * @complexity O(1)
     */
    @Override
    public void enqueue(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException();
        }
        this.list.add(toAdd);
    }

    /**
     * Dequeue will remove the first item that was placed in the Queue.
     * 
     * @return the first item in the Queue.
     * @throws EmptyQueueException raised when the queue's length is zero (0).
     * @precondition the queue is not empty.
     * @postcondition the first item in the queue is removed and the size is
     *                decreased by 1.
     * @complexity O(1)
     */
    @Override
    public E dequeue() throws NoSuchElementException {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException();
        }
        E temp = this.list.get(0);
        this.list.remove(0);
        return temp;
    }

    /**
     * Peek provides a reference to the first item in the queue without removing
     * 
     * @return the first item in the queue.
     * @throws EmptyQueueException raised when the queue's length is zero (0).
     * @precondition the queue is not empty.
     * @postcondition none
     * @complexity O(1)
     */
    @Override
    public E peek() throws NoSuchElementException {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.list.get(0);
    }

    /**
     * dequeueAll removes all items in the queue.
     * 
     * @param none
     * @return none
     * @throws none
     * @postcondition the queue is empty and the size is 0.
     * @precondition the queue is not null.
     * @complexity O(1)
     */
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
