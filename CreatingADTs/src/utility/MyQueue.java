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
        // Checks if the queue is empty. Returns true if the queue has no elements,
        // which is determined by checking if the underlying list is empty.
        return this.list.isEmpty();
    }
    
    @Override
    public Iterator<E> iterator() {
        // Returns an iterator for the queue. This iterator will iterate over the elements
        // in the queue in the order they were added. The implementation delegates the iterator
        // creation to the underlying list, 'MyDLL<E>'.
        return this.list.iterator();
    }
    

    @Override
    public boolean equals(QueueADT<E> that) {
        // Compares this queue with another queue to check for equality. Two queues
        // are considered equal if they have the same size and their elements are equal
        // and in the same order. The method first checks basic conditions like null
        // references and size differences, and then compares elements sequentially.
    
        // Check for same reference
        if (this == that) return true;
    
        // Check for null and size mismatch
        if (that == null || this.size() != that.size()) return false;
    
        // Create iterators for both queues
        Iterator<E> thisIterator = this.iterator();
        Iterator<E> thatIterator = that.iterator();
    
        // Iterate through both queues and compare each pair of elements
        while (thisIterator.hasNext() && thatIterator.hasNext()) {
            E thisElement = thisIterator.next();
            E thatElement = thatIterator.next();
    
            // If one element is null and the other isn't, or if they are not equal, return false
            if ((thisElement == null && thatElement != null) || (thisElement != null && !thisElement.equals(thatElement))) {
                return false;
            }
        }
    
        // If all elements are equal and in the same order, return true
        return true;
    }
    
    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public E[] toArray(E[] holder) throws NullPointerException{
        if (holder == null) {
            throw new NullPointerException();
        }
        return this.list.toArray(holder);
    }

    @Override
    public int size() {
        return this.list.size();
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
