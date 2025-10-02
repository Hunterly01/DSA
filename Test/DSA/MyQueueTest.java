package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    @Test
    public void testMy_Empty_Queue() {
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.isEmpty());
    }
    @Test
    public void test_add_to_Empty_Queue() {
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.isEmpty());
        String name = "Hunter";
        myQueue.add(name);
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void test_add_to_Queue_if_is_full() {
        MyQueue myQueue = new MyQueue();
        assertTrue(myQueue.isEmpty());
        String name = "Hunter";
        myQueue.add(name);
        String name2 = "LEE";
        myQueue.add(name2);
        String name3 = "AS";
        myQueue.add(name3);
        String name4 = "queen";
        myQueue.add(name4);
        String name5 = "queener";
        myQueue.add(name5);
        assertThrows(RuntimeException.class, () -> myQueue.add("leev"));
    }

    @Test
    public void test_peek_if_is_empty() {
        MyQueue myQueue = new MyQueue();
        assertEquals(myQueue.poll(), null);
    }

    @Test
    public void test_to_peek(){
        MyQueue myQueue = new MyQueue();
        String name = "Hunter";
        myQueue.add(name);
        String name2 = "LEE";
        myQueue.add(name2);
        assertEquals(name, myQueue.peek());
    }
    @Test
    public void test_to_pull() {
        MyQueue myQueue = new MyQueue();
        String name = "Hunter";
        myQueue.add(name);
        String name2 = "LEE";
        myQueue.add(name2);
        assertEquals(name, myQueue.poll());
    }
    @Test
    public void test_to_remove() {
        MyQueue myQueue = new MyQueue();
        String name = "Hunter";
        myQueue.add(name);
        String name2 = "LEE";
        myQueue.add(name2);
        assertEquals(name, myQueue.remove());

    }

    @Test
    public void test_to_remove_if_is_Empty() {
        MyQueue myQueue = new MyQueue();
        assertThrows(IllegalStateException.class, () -> myQueue.remove());
    }

    @Test
    public void test_to_remove_if_is_full() {
        MyQueue myQueue = new MyQueue();
        String name = "Hunter";
        myQueue.add(name);
        String name2 = "LEE";
        myQueue.add(name2);
        String name3 = "queen";
        myQueue.add(name3);
        String name4 = "queener";
        myQueue.add(name4);
        String name5 = "queener";
        myQueue.add(name5);
        assertThrows(IllegalStateException.class, () -> myQueue.remove());

    }
}
