package utility;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    @Override
    public E pop() throws EmptyStackException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    @Override
    public E peek() throws EmptyStackException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
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
    public boolean contains(E toFind) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
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
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).equals(toFind)) {
                return i;
            }
        }
        return -1;
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
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                if (index < list.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public E next() throws NoSuchElementException {
                if (this.hasNext()) {
                    E temp = list.get(index);
                    index++;
                    return temp;
                } else {
                    throw new NoSuchElementException();
                }
            }
        };
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
        if (this.size() != that.size()) {
            return false;
        }

        Iterator<E> thisIter = this.iterator();
        Iterator<E> thatIter = that.iterator();

        while (thisIter.hasNext()) {
            if (!thisIter.next().equals(thatIter.next())) {
                return false;
            }
        }

        return true;
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
        return this.list.size();
    }
}
