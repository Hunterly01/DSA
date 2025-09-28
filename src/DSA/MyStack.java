package DSA;


public class MyStack {
    private int count;
    private String [] element;
    private static final int length = 5;
    public MyStack() {
        this.element = new String [length];
        this.count = 0;

    }
    public boolean isEmpty(){
        return this.count == 0;
    }

    public void push(String element){
        this.element[count] = element;
        count++;
    }
    public String pop(){
        if(isEmpty()){
             throw new IllegalStateException("Stack is empty");
        }
        this.element[count--] = null;
        return element[count];
    }

    public String peek(){
        if(isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return this.element[count-1];
    }


}
