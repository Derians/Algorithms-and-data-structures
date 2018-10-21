/**
 * Created by Ivan Chaykin
 * Date: 19.10.2018
 * Time: 10:41
 */
public interface LinkedList extends Iterable {

    void add(int value);

    Link remove();

    boolean isEmpty();

    int getSize();

    Link search(int value);

    Link remove(int value);

    void display();

    Link getFirstElement();

    void setFirstElement(Link link);
}
