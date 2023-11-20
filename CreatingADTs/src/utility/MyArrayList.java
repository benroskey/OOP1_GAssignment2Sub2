package utility;

import java.util.NoSuchElementException;

import adt.ListADT;

public class MyArrayList<E> implements ListADT<E>, Iterator<E> {
    private E[] data;

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

    @Override
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

    @Override
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

    @Override
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
    public Object[] toArray(Object[] toHold) throws NullPointerException {
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
}
