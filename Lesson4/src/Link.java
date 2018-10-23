import java.util.Objects;

/**
 * Created by Ivan Chaykin
 * Date: 19.10.2018
 * Time: 10:39
 */
public class Link {

    private final int data;
    private Link next;

    public Link(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Link{" +
                "data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return data == link.data;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}