package utility;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import adt.Iterator;
import adt.StackADT;
public class MyStack<E> implements StackADT<E>, Iterator<E> {
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
        // Checks if the stack is empty. Returns true if the stack has no elements,
        // which is determined by checking if the underlying list is empty.
        return this.list.isEmpty();
    }
    
    @Override
    public Object[] toArray() {
        // Converts the stack into an array. This method leverages the toArray method
        // of the underlying list, returning an array containing all of the elements
        // in this stack in proper sequence (from the bottom of the stack to the top).
        return this.list.toArray();
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public E[] toArray(E[] holder) throws NullPointerException {
        // Converts the stack into an array of a specific type. The provided array
        // 'holder' is used to determine the type of the returned array. If 'holder'
        // is large enough to hold the stack, it is used; otherwise, a new array is
        // allocated for this purpose.
        if (holder == null) {
            throw new NullPointerException("Holder array cannot be null");
        }
    
        // If the holder array is not large enough, a new one is created
        if (holder.length < this.list.size()) {
            holder = (E[])java.lang.reflect.Array.newInstance(holder.getClass().getComponentType(), this.list.size());
        }
    
        // Copy elements from the list to the array
        System.arraycopy(this.list.toArray(), 0, holder, 0, this.list.size());
    
        // If the holder array is larger than the stack size, set the element immediately following
        // the end of the stack to null (as per the API specification).
        if (holder.length > this.list.size()) {
            holder[this.list.size()] = null;
        }
    
        return holder;
    }
    
    @Override
    public boolean contains(E toFind) throws NullPointerException {
        // Checks if the stack contains a specific element. It leverages the functionality
        // of the underlying list's 'contains' method. Throws a NullPointerException
        // if the element to find is null.
        if (toFind == null) {
            throw new NullPointerException("Cannot search for null element");
        }
        return this.list.contains(toFind);
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
    private int currentIndex = 0; // Keeps track of the current position in the iteration

    @Override
    public boolean hasNext() {
        // Checks if there are more elements to iterate over in the stack.
        // This is determined by comparing the current index with the size of the list.
        // If the current index is less than the size of the list, it means there are more elements to iterate.
        return currentIndex < this.list.size();
    }
    
    @Override
    public E next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }
}

