/**
 * Created by Ivan Chaykin
 * Date: 16.10.2018
 * Time: 20:38
 */
public class StackImpl implements Stack {

    protected int[] data;
    protected int size;

    public StackImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    @Override
    public void push(int value) {
        data[size++] = value;
    }

    @Override
    public int pop() {
        return data[--size];
    }

    @Override
    public int peek() {
        return data[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size >= data.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }
}
