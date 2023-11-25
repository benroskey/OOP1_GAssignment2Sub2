package utility;

import java.util.NoSuchElementException;

import adt.Iterator;
import adt.ListADT;

public class MyArrayList<E> implements ListADT<E>, Iterator<E> {
    private E[] data;

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
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.data = (E[]) new Object[0];
    }

    @Override
    public int size() {
        // Returns the length of the data array, which represents the number of elements in the list.
        return this.data.length;
    }
    
    

    @Override
    @SuppressWarnings("unchecked")
    public void clear() {
        // Clears the list by assigning a new empty array to 'data'.
        this.data = (E[]) new Object[0];
    }
    
    

    @Override
    @SuppressWarnings("unchecked")
    public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
        // Throws NullPointerException if the object to be added is null.
        if (toAdd == null) {
            throw new NullPointerException("Cannot add null to the list");
        }
    
        // Throws IndexOutOfBoundsException if the index is out of the valid range.
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size());
        }
    
        // Create a new array with size one greater than the current array to accommodate the new element.
        E[] newData = (E[]) new Object[this.size() + 1];
    
        // Copy elements from the old array to the new array, up to the specified index.
        System.arraycopy(this.data, 0, newData, 0, index);
    
        // Insert the new element at the specified index.
        newData[index] = toAdd;
    
        // Copy the remaining elements from the old array to the new array, after the inserted element.
        System.arraycopy(this.data, index, newData, index + 1, this.size() - index);
    
        // Update the data array reference to the new array.
        this.data = newData;
    
        return true;
    }
    
    

    @Override
    @SuppressWarnings("unchecked")
    public boolean add(E toAdd) throws NullPointerException {
        // Throws NullPointerException if the object to be added is null.
        if (toAdd == null) {
            throw new NullPointerException("Cannot add null to the list");
        }
    
        // Create a new array with size one greater than the current array to accommodate the new element.
        E[] newData = (E[]) new Object[this.size() + 1];
    
        // Copy all elements from the old array to the new array.
        System.arraycopy(this.data, 0, newData, 0, this.size());
    
        // Add the new element to the end of the new array.
        newData[this.size()] = toAdd;
    
        // Update the data array reference to the new array.
        this.data = newData;
    
        return true;
    }
    
    
    
    @Override
@SuppressWarnings("unchecked")
public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
   // Throws NullPointerException if the provided list is null.
    if (toAdd == null) {
        throw new NullPointerException("Cannot add null list");
    }
    
    // Create a new array with size equal to the sum of the current size and the size of the provided list.
    E[] newData = (E[]) new Object[this.size() + toAdd.size()];
    
    // Copy all elements from the current array to the new array.
    System.arraycopy(this.data, 0, newData, 0, this.size());
    
    // Copy elements from the provided list to the new array.
    System.arraycopy(toAdd.toArray(), 0, newData, this.size(), toAdd.size());
    
    // Update the data array reference to the new array.
    this.data = newData;
    
    return true;
}
    
    

    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index index of the element to return. 
     * @return E the element at the specified position in this list.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
     * @precondition The list is not empty and the index is in the list.
     * @postcondition none.
     * @complexity O(n)
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        for (int i = 0; i < this.size(); i++) {
            if (i == index) {
                E temp = (E) this.data[i];
                return temp;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     * 
     * @param toRemove element to be removed from this list, if present.
     * @return E the element previously at the specified position.
     * @throws NullPointerException if the specified element is null and this list does not permit null elements.
     * @precondition The list is not empty and the element is in the list.
     * @postcondition The element is removed from the list and the size is decreased by 1.
     * @complexity O(n)
     */
    @Override
    @SuppressWarnings("unchecked")
    public E remove(E toRemove) throws NullPointerException {
        if (toRemove == null) {
            throw new NullPointerException();
        }
        E temp = (E) this.data[0];
        for (int i = 0; i < this.size(); i++) {
            if (this.data[i] == toRemove) {
                temp = (E) this.data[i];

                E[] newList = (E[]) new Object[this.size()];
                int count = 0;
                for (int j = 0; j < this.size(); j++) {
                    if (j == i) {
                        continue;
                    }
                    newList[count] = this.data[j];
                    count++;
                }
                this.data = newList;

                return temp;
            }
        }
        return temp;
    }

    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index the index of the element to be removed.
     * @return E the element previously at the specified position.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size()).
     * @precondition The list is not empty and the index is in the list.
     * @postcondition The element is removed from the list and the size is decreased by 1.
     * @complexity O(n)
     */
    @Override
    @SuppressWarnings("unchecked")
    public E remove(int index) throws IndexOutOfBoundsException {
        E temp = (E) this.data[index];
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = 0; i < this.size(); i++) {
            if (i == index) {
                temp = this.data[i];

                E[] newList = (E[]) new Object[this.size()];
                int count = 0;
                for (int j = 0; j < this.size(); j++) {
                    if (j == i) {
                        continue;
                    }
                    newList[count] = this.data[j];
                    count++;
                }
                this.data = newList;

                return temp;
            }
        }
        return temp;
    }

    /**
     * Replaces the element at the specified position in this list with the specified element.
     * 
     * @param index index of the element to replace.
     * @param toChange element to be stored at the specified position.
     * @return E the element previously at the specified position.
     * @throws NullPointerException if the specified element is null and this list does not permit null elements.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size()).
     * @precondition The list is not empty and the index is in the list.
     * @postcondition The element is replaced in the list and the size is unchanged.
     */
    @Override
    @SuppressWarnings("unchecked")
    public E set(int index, Object toChange) throws NullPointerException, IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < this.size(); i++) {
            if (i == index) {
                if (this.data[i] == null) {
                    throw new NullPointerException();
                }
                
                E temp = (E) this.data[i];
                this.data[i] = (E) toChange;
                return temp;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    /**
     * Returns true if this list contains no elements.
     * 
     * @return true if this list contains no elements, false otherwise.
     * @throws none
     * @precondition none
     * @postcondition none
     * @complexity O(1)
     */
    @Override
    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object toFind) throws NullPointerException {
        if (toFind == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.data[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E[] toArray(Object[] toHold) throws NullPointerException {
        if (toHold == null) {
            throw new NullPointerException();
        }
        if (toHold.length < this.size()) {
            toHold = (E[]) new Object[this.size()];
        }
        for (int i = 0; i < this.size(); i++) {
            toHold[i] = this.data[i];
        }
        return (E[]) toHold;
    }

    @Override
    public Object[] toArray() {
        Object[] temp = new Object[this.size()];
        for (int i = 0; i < this.size(); i++) {
            temp[i] = this.data[i];
        }
        return temp;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int curr = 0;

            @Override
            public boolean hasNext() {
                return curr < data.length;
            }
            @Override
            public E next() throws NoSuchElementException {
                if (this.hasNext()) {
                    E temp = data[curr];
                    curr++;
                    return temp;
                }
                else
                {
                    throw new NoSuchElementException();
                }
            }
        };
    }

    @Override
    public boolean hasNext() {
        if (this.data[0] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public E next() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return this.data[0];
    }

    public int indexOf(E toFind) {
        return 0;
    }
}
