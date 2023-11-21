package utility;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

import adt.Iterator;
import adt.StackADT;

public class MyStack<E> implements StackADT<E> {
    private MyArrayList<E> list;

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

    @Override
    public int search(E toFind) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).equals(toFind)) {
                return i;
            }
        }
        return -1;
    }

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

    @Override
    public int size() {
        return this.list.size();
    }
}
