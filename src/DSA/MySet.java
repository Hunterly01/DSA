package DSA;

public class MySet {
    private int count;
    private String[] element;
    private int size;

    public MySet(int size) {
        this.size = size;
        count = 0;
        element = new String[size];

    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean contains(String value){
        for (int count = 0; count < element.length; count++){
            if (element[count] != null && element[count].equals(value)) {
                return true;
            }

        }
        return false;
    }
    public boolean add(String value){
        if(contains(value)){
            return false;
        }
        element[count] = value;
        count++;
        return true;
    }
    public void clear(){
        for(int count = 0; count < element.length; count++){
            element[count] = null;
        }
        count = 0;
    }

    public int size(){
        return count;
    }

}
