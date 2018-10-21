/**
 * Created by Ivan Chaykin
 * Date: 19.10.2018
 * Time: 12:04
 */
public class LinkedQueueImpl implements Queue{

    private DoublyLinkList linkedList;

    public LinkedQueueImpl() {
        this.linkedList = new DoublyLinkListImpl();
    }

    @Override
    public void insertRight(int value) {
        linkedList.addLast(value);
    }

    @Override
    public int removeLeft() {
        return linkedList.remove().getData();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public void display() {
        linkedList.display();
    }
}