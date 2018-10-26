/**
 * Created by Ivan Chaykin
 * Date: 26.10.2018
 * Time: 10:15
 */
public interface Node {
    void setData(Person value);
    Person getData();

    int getKey();

    Node getLeftChild();
    Node getRightChild();

    void setRightChild(Node rightChild);
    void setLeftChild(Node leftChild);

    Node getChildByKey(int key);

    boolean isLeftChild(int key);

    boolean isLeaf();

    void display();
}
