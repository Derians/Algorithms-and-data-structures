/**
 * Created by Ivan Chaykin
 * Date: 26.10.2018
 * Time: 10:18
 */
public interface  Tree {

    void add(Person value);

    Person remove(int id);

    Person find(int id);

    boolean isEmpty();

    void display();

    int getSize();

    void traverse(TraverseMode mode);

    boolean isBalanced();

}
