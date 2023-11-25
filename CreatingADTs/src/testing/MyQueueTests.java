    package testing;
    
    import static org.junit.Assert.assertEquals;
    
    import java.util.Arrays;
    
    import org.junit.Test;
    
    import utility.MyQueue;
    
    public class MyQueueTests {
    
        @Test
        public void testEnqueue() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            queue.enqueue(1);
            queue.enqueue(2);
            assert(2 == queue.size());
            assert(1 == queue.peek());
        }
    
        @Test
        public void testDequeue() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            queue.enqueue(1);
            queue.enqueue(2);
            assertEquals(Integer.valueOf(1), queue.dequeue());
            assertEquals(Integer.valueOf(1), queue.dequeue());
    
        }
    
        @Test
        public void testPeek() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            queue.enqueue(1);
            queue.enqueue(2);
            assert(1 == queue.peek());
            assert(1 == queue.peek());
        }
    
        @Test
        public void testDequeueAll() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.dequeueAll();
            assert(0 == queue.size());
        }
    
        @Test
        public void isEmpty() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            assert(queue.isEmpty());
            queue.enqueue(1);
            assert(!queue.isEmpty());
        }
    
        @Test
        public void testEquals() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            queue.enqueue(1);
            queue.enqueue(2);
            MyQueue<Integer> queue2 = new MyQueue<Integer>();
            queue2.enqueue(1);
            queue2.enqueue(2);
            assert(queue.equals(queue2));
        }
    
        @Test
        public void testEqualsFalse() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            queue.enqueue(1);
            queue.enqueue(2);
            MyQueue<Integer> queue2 = new MyQueue<Integer>();
            queue2.enqueue(1);
            queue2.enqueue(3);
            assert(!queue.equals(queue2));
        }
    
    @Test
    public void testToArray() {
    MyQueue<Integer> queue = new MyQueue<Integer>();
    queue.enqueue(1);
    queue.enqueue(2);
    Object[] objArray = queue.toArray();
    Integer[] array = Arrays.copyOf(objArray, objArray.length, Integer[].class);
    assert(2 == array.length);
    }
    
    
    
        @Test
        public void testToArrayToHold() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            queue.enqueue(1);
            queue.enqueue(2);
            Integer[] array = new Integer[2];
            queue.toArray(array);
            assert(2 == array.length);
        }
    
    
        @Test
        public void testSize() {
            MyQueue<Integer> queue = new MyQueue<Integer>();
            assert(0 == queue.size());
            queue.enqueue(1);
            assert(1 == queue.size());
        }
    }