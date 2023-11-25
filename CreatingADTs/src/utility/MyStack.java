package utility;

import java.util.EmptyStackException;
import adt.Iterator;
import adt.StackADT;

public class MyStack<E> implements StackADT<E> {
    private MyArrayList<E> list;

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
    public MyStack() {
        this.list = new MyArrayList<E>();
    }

    @Override
    public void push(E toAdd) throws NullPointerException {
        if (toAdd == null) {
            throw new NullPointerException("Cannot push null element to stack");
        }
        list.add(toAdd);
    }

    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    @Override
    public E peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
	@SuppressWarnings("unchecked")
    public E[] toArray(E[] holder) throws NullPointerException {
        if (holder == null) {
            throw new NullPointerException("Array provided cannot be null");
        }
        return (E[]) list.toArray(holder);
    }

    @Override
    public boolean contains(E toFind) throws NullPointerException {
        if (toFind == null) {
            throw new NullPointerException("Cannot search for null element");
        }
        return list.contains(toFind);
    }

    /**
     * Returns the index of the first occurrence of the specified element in this
     * 
     * @param toFind element to search for.
     * @return the index of the first occurrence of the specified element in this
     *        list, or -1 if this list does not contain the element.
     * @throws NullPointerException if the specified element is null and this list
     *       does not permit null elements.
     * @precondition none
     * @postcondition none
     * @complexity O(n)
     */
    @Override
    public int search(E toFind) {
        int index = list.indexOf(toFind);
        if (index == -1) {
            return -1;
        }
        return size() - index;
    }

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     * 
     * @param none
     * @return an iterator over the elements in this list in proper sequence.
     * @throws none
     * @precondition none
     * @postcondition none
     * @complexity O(1)
     */
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    /**
     * Returns true if this list contains no elements.
     * 
     * @param none
     * @return true if this list contains no elements, false otherwise.
     * @throws none
     * @precondition none
     * @postcondition none
     * @complexity O(1)
     */
    @Override
    public boolean equals(StackADT<E> that) {
        // Implementation remains the same
        return super.equals(that);
    }

    /**
     * Returns the number of elements in this list.
     * 
     * @param none
     * @return the number of elements in this list.
     * @throws none
     * @precondition none
     * @postcondition none
     * @complexity O(1)
     */
    @Override
    public int size() {
        return list.size();
    }
}
