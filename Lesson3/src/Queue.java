/**
 * Created by Ivan Chaykin
 * Date: 16.10.2018
 * Time: 20:11
 */
public interface Queue {

    void insertRight(int value);
    int removeLeft();

    boolean isEmpty();
    boolean isFull();

    int getSize();

    void display();

}
