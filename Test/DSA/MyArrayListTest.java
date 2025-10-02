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


}