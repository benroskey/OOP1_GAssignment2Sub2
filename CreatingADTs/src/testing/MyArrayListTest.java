import java.beans.Transient;

import org.junit.Test;
import adt.Iterator;

public class MyArrayListTest {
    @Test
    public void testSize() {
        // create list
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testClear() {
        // create list
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testAdd() {
        // create list
        list.add(1);
        list.add(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    public void testAddIndex() {
        // create list
        list.add(0, 1);
        list.add(1, 2);
        list.add(1, 3);
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(2, list.get(2));
    }

    @Test
    public void testAddAll() {
        // create list
        list.add(1);
        list.add(2);
        list.add(3);
        MyArrayList<Integer> list2 = new MyArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list.addAll(list2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
        assertEquals(5, list.get(4));
        assertEquals(6, list.get(5));
    }

    @Test
    public void testGet() {
        // create list
        list.add(1);
        list.add(2);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    public void testRemove() {
        // create list
        list.add('a');
        list.add('b');
        list.add('c');
        list.remove('b');
        assertEquals('a', list.get(0));
        assertEquals('c', list.get(1));
    }

    @Test
    public void testRemoveIndex() {
        // create list
        list.add('a');
        list.add('b');
        list.add('c');
        list.remove(1);
        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    public void testSet() {
        // create list
        list.add('a');
        list.add('b');
        list.add('c');
        list.set(1, 'd');
        assertEquals('a', list.get(0));
        assertEquals('d', list.get(1));
        assertEquals('c', list.get(2));
    }

    @Test
    public void testIsEmpty() {
        // create list
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testContains() {
        // create list
        list.add(1);
        list.add(2);
        list.add(3);
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
        assertFalse(list.contains(4));
    }

    @Test
    public void testToArray() {
        // create list
        list.add(1);
        list.add(2);
        list.add(3);
        Object[] array = list.toArray();
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }

    @Test
    public void testToArrayToHold() {
        // create list
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] array = new Integer[3];
        list.toArray(array);
        assertEquals(1, array[0]);
        assertEquals(2, array[1]);
        assertEquals(3, array[2]);
    }

    @Test
    public void testIterator() {
        // create list
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}
