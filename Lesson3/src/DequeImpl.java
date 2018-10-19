/**
 * Created by Ivan Chaykin
 * Date: 17.10.2018
 * Time: 22:22
 */
public class DequeImpl implements Deque {

    public static final int DEFAULT_FRONT = 0;
    public static final int DEFAULT_REAR = -1;
    protected int[] data;
    protected int size;

    private int front;
    private int rear;

    public DequeImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
        this.front = DEFAULT_FRONT;
        this.rear = DEFAULT_REAR;
    }

    @Override
    public void insertLeft(int value) {
        if (front - 1 < 0)
            front = data.length;

        data[--front] = value;
        size++;
    }

    @Override
    public void insertRight(int value) {
        if (rear == data.length - 1)
            rear = DEFAULT_REAR;

        data[++rear] = value;
        size++;
    }

    @Override
    public int removeLeft() {
        int value = data[front++];
        if (front == data.length)
            front = DEFAULT_FRONT;
        size--;
        return value;
    }

    @Override
    public int removeRight() {
        if (rear < 0)
            rear = data.length - 1;

        int value = data[rear--];
        size--;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        int currentSize = size;
        int currentFront = front;
        while (currentSize > 0) {
            System.out.println(data[currentFront++]);
            if (front == data.length)
                currentFront = DEFAULT_FRONT;
            currentSize--;
        }
    }
}
