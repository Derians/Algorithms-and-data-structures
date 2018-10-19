/**
 * Created by Ivan Chaykin
 * Date: 16.10.2018
 * Time: 21:40
 */
public class PriorityQueue implements Queue{

    private int[] data;
    private int size;

    public PriorityQueue(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    public int removeLeft() {
        return data[--size];
    }

    public int peek() {
        return data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        //TODO: implement me
    }

    public void insertRight(int value) {
        int index = 0;
        if (isEmpty()) {
            data[size++] = value;
        }
        else {
            for (index = size - 1; index >= 0; index--) {
                if (value > data[index]) {
                    data[index + 1] = data[index];
                }
                else {
                    break;
                }
            }
            data[index + 1] = value;
            size++;
        }
    }
}