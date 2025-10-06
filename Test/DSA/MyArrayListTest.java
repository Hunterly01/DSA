package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    @Test
    public void test_to_check_if_array_is_empty() {
        MyArrayList myArrayList = new MyArrayList(3);
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void test_to_add(){
        MyArrayList myArrayList = new MyArrayList(3);
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(1, "Hunter");
        assertFalse(myArrayList.isEmpty());


    }
    @Test
    public void test_to_add_and_return_boolean(){
        MyArrayList myArrayList = new MyArrayList(3);
        assertTrue(myArrayList.isEmpty());
        myArrayList.add(1, "Hunter");
        assertFalse(myArrayList.isEmpty());
        myArrayList.add("Hunter");
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void test_to_clear(){
        MyArrayList myArrayList = new MyArrayList(3);
        myArrayList.add(1, "Hunter");
        myArrayList.add(2, "Hunter2");
        myArrayList.clear();
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void test_to_get_index(){
        MyArrayList myArrayList = new MyArrayList(5);
        myArrayList.add(1, "Hunter");
        myArrayList.add(2, "Hunter2");
        myArrayList.add(3, "Hunter3");
        myArrayList.add(4, "Hunter4");
        assertEquals(myArrayList.get(2), "Hunter2");
    }

    @Test
    public void test_to_get_index_to_throw(){
        MyArrayList myArrayList = new MyArrayList(5);
        assertThrows(IndexOutOfBoundsException.class, () -> myArrayList.get(3));
    }

    @Test
    public void test_to_remove() {
        MyArrayList myArrayList = new MyArrayList(5);
        myArrayList.add("Hunter");
        myArrayList.add("Hunter2");
        myArrayList.add("Hunter3");

        myArrayList.remove(2);
        myArrayList.remove(1);
        myArrayList.remove(0);

        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void test_to_replace_value(){
        MyArrayList myArrayList = new MyArrayList(5);
        myArrayList.add("Hunter");
        myArrayList.add("Hunter2");
        myArrayList.add("Hunter3");
        myArrayList.add("Hunter4");
        String oldValue = myArrayList.get(2);
        assertEquals(oldValue, "Hunter3");
    }
    @Test
    public void test_to_check_size(){
        MyArrayList myArrayList = new MyArrayList(4);
        myArrayList.add("Hunter");
        myArrayList.add("Hunter2");
        myArrayList.add("Hunter3");
        myArrayList.add("Hunter4");

        int size = myArrayList.size();
        assertTrue(size == 4);
    }
}