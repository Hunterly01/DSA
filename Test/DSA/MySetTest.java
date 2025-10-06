package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MySetTest {
    @Test
    public void test_if_is_empty() {
        MySet mySet = new MySet(3);
        assertTrue(mySet.isEmpty());

    }
    @Test
    public void test_to_add() {
        MySet mySet = new MySet(3);
        assertTrue(mySet.add("Adura"));
        assertTrue(mySet.contains("Adura"));
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void test_to_clear() {
        MySet mySet = new MySet(3);
        mySet.add("Adura");
        mySet.add("chichi");
        mySet.clear();
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void test_to_check_size() {
        MySet mySet = new MySet(3);
        mySet.add("Adura");
        mySet.add("chichi");
        mySet.add("Adurag");
        mySet.size();
        assertTrue(mySet.size() == 3);
    }
}
