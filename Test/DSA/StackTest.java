package DSA;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void test_empty_Stack() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void test_that_stack_is_not_empty() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
        stack.push("A");
        assertFalse(stack.isEmpty());
    }
    @Test
    public void test_push_two_element_() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
        stack.push("A");
        stack.push("B");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void test_pop_two_element_() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
        stack.push("A");
        stack.push("B");
        assertFalse(stack.isEmpty());
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void test_to_peek() {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        String peek = stack.peek();
        assertEquals("B", peek);
        stack.pop();
        assertEquals("A", stack.peek());
    }

    @Test
    public void test_empty_pop_to_throw_exception() {
        MyStack stack = new MyStack();
        assertThrows(IllegalStateException.class, () -> stack.pop());
    }
    @Test
    public void test_to_peek_throw_exception() {
        MyStack stack = new MyStack();
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }
}