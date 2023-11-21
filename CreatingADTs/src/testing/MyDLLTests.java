package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import adt.Iterator;
import utility.MyDLL;

public class MyDLLTests {

    @Test
    public void testSize() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        assertEquals(0, list.size());
        list.add(1);
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testClear() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        list.add(1);
        list.add(2);
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void testAdd() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        list.add(1);
        list.add(2);
        assert(1 == list.get(0));
        assert(2 == list.get(1));
    }

    @Test
    public void testAddIndex() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        list.add(0, 1);
        list.add(1, 2);
        list.add(1, 3);
        assert(1 == list.get(0));
        assert(2 == list.get(1));
        assert(3 == list.get(2));
    }

    @Test
    public void testAddAll() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        MyDLL<Integer> list2 = new MyDLL<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list.addAll(list2);
        assert(1 == list.get(0));
        assert(2 == list.get(1));
        assert(3 == list.get(2));
        assert(4 == list.get(3));
        assert(5 == list.get(4));
        assert(6 == list.get(5));

    }

    @Test
    public void testGet() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        list.add(1);
        list.add(2);
        assert(1 == list.get(0));
        assert(2 == list.get(1));
    }

    @Test
    public void testRemove() {
        MyDLL<Character> list = new MyDLL<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.remove('b');
        assert(1 == list.get(0));
        assert(2 == list.get(1));
    }

    @Test
    public void testRemoveIndex() {
        MyDLL<Character> list = new MyDLL<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.remove(1);
        assert(1 == list.get(0));
        assert(2 == list.get(1));
    }

    @Test
    public void testSet() {
        MyDLL<Character> list = new MyDLL<Character>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.set(1, 'd');
        assert(1 == list.get(0));
        assert(2 == list.get(1));
        assert(3 == list.get(2));
    }

    @Test
    public void testIsEmpty() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testContains() {
        MyDLL<Integer> list = new MyDLL<Integer>();
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
        MyDLL<Integer> list = new MyDLL<Integer>();
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
        MyDLL<Integer> list = new MyDLL<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] array = new Integer[3];
        list.toArray(array);
        assertEquals(list.get(0), array[0]);
        assertEquals(list.get(1), array[1]);
        assertEquals(list.get(2), array[2]);
    }

    @Test
    public void testIterator() {
        MyDLL<Integer> list = new MyDLL<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(list.get(0), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(list.get(1), iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(list.get(2), iterator.next());
        assertFalse(iterator.hasNext());
    }
}
