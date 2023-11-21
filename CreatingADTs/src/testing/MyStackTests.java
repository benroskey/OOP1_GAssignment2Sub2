package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import adt.Iterator;
import utility.MyStack;

public class MyStackTests {
    @Test
    public void testPush() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        assert(2 == stack.size());
        assert(2 == stack.peek());
    }

    @Test
    public void testPop() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        assert(2 == stack.pop());
        assert(1 == stack.pop());
    }

    @Test
    public void testPeek() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        assert(2 == stack.peek());
        assert(2 == stack.peek());
    }

    @Test
    public void testClear() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.clear();
        assert(0 == stack.size());
    }

    @Test
    public void testIsEmpty() {
        MyStack<Integer> stack = new MyStack<Integer>();
        assert(stack.isEmpty());
        stack.push(1);
        assert(!stack.isEmpty());
    }

    @Test
    public void testToArray() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer[] array = (Integer[]) stack.toArray();
        assert(2 == array.length);
        assert(2 == array[0]);
        assert(1 == array[1]);
    }

    @Test
    public void testToArrayToHold() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer[] array = new Integer[2];
        stack.toArray(array);
        assert(2 == array.length);
        assert(2 == array[0]);
        assert(1 == array[1]);
    }

    @Test
    public void testContains() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertTrue(stack.contains(1));
        assertTrue(stack.contains(2));
        assertTrue(stack.contains(3));
        assertFalse(stack.contains(4));
    }

    @Test
    public void testSearch() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assert(1 == stack.search(1));
        assert(2 == stack.search(2));
        assert(3 == stack.search(3));
        assert(-1 == stack.search(4));
    }

    @Test
    public void testIterator() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Iterator<Integer> it = stack.iterator();
        assert(it.hasNext());
        assert(3 == it.next());
        assert(2 == it.next());
        assert(1 == it.next());
        assert(!it.hasNext());
    }

    @Test
    public void testEquals() {
        MyStack<Integer> stack1 = new MyStack<Integer>();
        MyStack<Integer> stack2 = new MyStack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        assert(stack1.equals(stack2));
    }

    @Test
    public void testSize() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assert(3 == stack.size());
    }

    @Test
    public void testHasNext() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Iterator<Integer> it = stack.iterator();
        assert(it.hasNext());
        assert(3 == it.next());
        assert(it.hasNext());
        assert(2 == it.next());
        assert(it.hasNext());
        assert(1 == it.next());
        assert(!it.hasNext());
    }

    @Test
    public void testNext() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Iterator<Integer> it = stack.iterator();
        assert(it.hasNext());
        assert(3 == it.next());
        assert(it.hasNext());
        assert(2 == it.next());
        assert(it.hasNext());
        assert(1 == it.next());
        assert(!it.hasNext());
    }
}
