package resources;

import utilities.Iterator;
import utilities.ListADT;

public class MyArrayList implements ListADT {
    private Object[] data;

    public MyArrayList() {
        data = new Object[0];
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
    public boolean addAll(ListADT toAdd) throws NullPointerException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addAll'");
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < this.size(); i++) {
            if (i == index) {
                return this.data[i];
            }
        }
        return null;
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < this.size(); i++) {
            if (i == index) {
                Object temp = this.data[i];

                Object[] newList = new Object[this.size() - 1];
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
        return index;
    }

    @Override
    public Object remove(Object toRemove) throws NullPointerException {
        for (int i = 0; i < this.size(); i++) {
            if (this.data == toRemove) {
                Object temp = this.data[i];

                Object[] newList = new Object[this.size() - 1];
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
    public Object set(int index, Object toChange) throws NullPointerException, IndexOutOfBoundsException {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < this.size(); i++) {
            if (i == index) {
                if (this.data[i] == null) {
                    throw new NullPointerException();
                }

                Object temp = this.data[i];
                this.data[i] = toChange;
                return temp;
            }
        }
        thor
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
    public Iterator iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}
