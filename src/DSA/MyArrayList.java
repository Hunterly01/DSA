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
        this.element[count] = value;
        return count++ == size;
    }
}
