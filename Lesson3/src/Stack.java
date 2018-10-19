/**
 * Created by Ivan Chaykin
 * Date: 16.10.2018
 * Time: 20:37
 */
public interface Stack {
    void push(int value);

    int pop();

    int peek();

    boolean isEmpty();

    boolean isFull();

    int getSize();

    void display();
}
