import java.util.Iterator;

/**
 * Created by Ivan Chaykin
 * Date: 21.10.2018
 * Time: 18:06
 */
public class LinkIterator implements Iterator {
    private LinkedListImpl linkedList;
    private Link currentElement;

    public LinkIterator(LinkedListImpl linkedList) {
        this.linkedList = linkedList;
    }

    @Override
    public boolean hasNext() {
        return currentElement == null || currentElement.getNext() != null;
    }

    @Override
    public Link next() {
        if (currentElement == null) {
            currentElement = linkedList.getFirstElement();
            return currentElement;
        } else {
            return currentElement = currentElement.getNext();
        }
    }

    @Override
    public void remove() {
        linkedList.remove(currentElement.getData());
    }
}