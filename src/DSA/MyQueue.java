package DSA;

public class MyQueue {
    private int count;
    private static final int length = 5;
    private String[] myArray;

    public MyQueue() {
        myArray  = new String[length];
        count = 0;
    }


    public boolean isEmpty() {
        return this.count == 0;
    }
    public boolean isFull() {
        return this.count == length;
    }

    public boolean add(String element) {
        if (count >= length) {
            throw new RuntimeException("Queue is full");
        }
       myArray[count++] = element;
        return true;
    }
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return myArray[0];
    }
    public String poll() {
        if (isEmpty()) {
            return null;
        }
        String element = myArray[0];
        for (int index = 0; index < count - 1; index++) {
            myArray[index] = myArray[index + 1];
        }
        myArray[--count] = null;
        return element;
    }
    public String remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (isFull()){
            throw new IllegalStateException("Queue is full");
        }
        return poll();
    }

}
