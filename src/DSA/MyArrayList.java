package DSA;

public class MyArrayList {
    private int count;
    private String[] element;
    private int size;

    public MyArrayList(int size) {
        this.count = 0;
        this.size = size;
        this.element = new String[size];

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(int index, String value) {
        this.element[index] = value;
        count++;
    }

    public boolean add(String value) {
        if (count >= size) {
            return false;
        }
        element[count++] = value;
        return true;
    }

    public void clear() {
        for (int count = 0; count < size; count++) {
            element[count] = null;
        }

         count = 0;
    }


    public String get(int index){
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return element[index];
    }

    public String remove(int index){
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");

        }
        String oldValue = element[index];
        for (int counter = 0; counter < count - 1; counter++) {
            element[counter] = element[counter + 1];
        }
        element[count] = null;
        count--;
        return oldValue;
    }

    public String set(int index, String value) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        String oldValue = element[index];
        element[index] = value;
        return oldValue;
    }

    public int size() {
        return count;
    }




}
