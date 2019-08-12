package majinxin;

public class MyStack {
    private static int SIZE = 20;
    private Object[] arr = null;
    private int index = -1;
    public MyStack() {
        arr = new Object[SIZE];
    }

    public void push(Object o) throws Exception {
        if (index >= SIZE-1) {
            throw new Exception("stack is full, max size is " + SIZE + ".");
        }
        arr[++index]=o;
    }

    public Object pop() {
        if (index >= 0) {
            return arr[index--];
        } else return -1;
    }

    public Object peek() {
        if (index >= 0) {
            return arr[index];
        } else return -1;
    }
}
