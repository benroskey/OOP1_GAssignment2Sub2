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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    @Override
    public boolean add(int index, Object toAdd) throws NullPointerException, IndexOutOfBoundsException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean add(Object toAdd) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
    @Override
    public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
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
        for (int i = 0; i < this.size(); i++) {
            if (i == index) {
                E temp = this.data[i];

                E[] newList = (E[]) new Object[this.size() - 1];
                for (int j = 0; j < this.size(); j++) {
                    if (j == i) {
                        continue;
                    }
                    newList[j] = this.data[j];
                }
                this.data = newList;

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
        for (int i = 0; i < this.size(); i++) {
            if (this.data == toRemove) {
                E temp = (E) this.data[i];

                E[] newList = (E[]) new Object[this.size() - 1];
                for (int j = 0; j < this.size(); j++) {
                    if (j == i) {
                        continue;
                    }
                    newList[j] = this.data[j];
                }
                this.data = newList;

                return temp;
            }
        }
        throw new NullPointerException();
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public E[] toArray(Object[] toHold) throws NullPointerException {
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

    public int indexOf(E toFind) {
        return 0;
    }
}
