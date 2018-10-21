import java.util.Iterator;

/**
 * Created by Ivan Chaykin
 * Date: 21.10.2018
 * Time: 17:36
 */
public class Lesson4 {

    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        for (Object link: linkedList)
            System.out.println(link.toString());

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println("LinkedList is empty: " + linkedList.isEmpty());

    }
}
