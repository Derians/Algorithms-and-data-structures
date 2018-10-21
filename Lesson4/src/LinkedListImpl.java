/**
 * Created by Ivan Chaykin
 * Date: 19.10.2018
 * Time: 10:42
 */
public class LinkedListImpl implements LinkedList {

    protected Link firstElement;
    protected int size;

    public LinkedListImpl() {
        this.size = 0;
    }

    @Override
    public void add(int value) {
        Link link = new Link(value);
        link.setNext(firstElement);
        firstElement = link;
        size++;
    }

    @Override
    public Link remove() {
        Link deletedElement = firstElement;
        firstElement = deletedElement.getNext();
        size--;
        return deletedElement;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Link search(int value) {
        Link currentLink = firstElement;

        while (currentLink != null) {
            if (currentLink.getData() == value)
                return currentLink;
            currentLink = currentLink.getNext();
        }
        return null;
    }

    @Override
    public Link remove(int value) {
        Link currentLink = firstElement;
        Link previousLink = null;

        while (currentLink != null) {
            if (currentLink.getData() == value)
                break;
            previousLink = currentLink;
            currentLink = currentLink.getNext();
        }

        if (currentLink == null)
            return null;

        if (previousLink == null) {
            firstElement = currentLink.getNext();
        } else {
            previousLink.setNext(currentLink.getNext());
        }
        size--;
        return currentLink;
    }

    @Override
    public void display() {
        Link currentLink = firstElement;
        StringBuilder displayString = new StringBuilder();

        while (currentLink != null) {
            displayString.append(currentLink);
            currentLink = currentLink.getNext();
            if (currentLink != null)
                displayString.append(" -> ");
        }
        System.out.println(displayString);
    }

    @Override
    public Link getFirstElement() {
        return firstElement;
    }

    @Override
    public void setFirstElement(Link link) {
        firstElement = link;
    }

    @Override
    public LinkIterator iterator() {
        return new LinkIterator(this);
    }
}
