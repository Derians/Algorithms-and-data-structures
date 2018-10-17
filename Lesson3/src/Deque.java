/**
 * Created by Ivan Chaykin
 * Date: 17.10.2018
 * Time: 22:18
 */
public interface Deque extends Queue {

    void insertLeft(int value);

    int removeRight();

}
