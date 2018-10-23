/**
 * Created by Ivan Chaykin
 * Date: 19.10.2018
 * Time: 11:20
 */
public class Tests {

    public static void main(String[] args) {

//        testLinkedList();
//        testDoublyLinkList();
//        testLinkedQueue();
//        testLinkedStack();

    }

    private static void testLinkedStack() {
        Stack stack = new LinkedStackImpl();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        stack.display();

        System.out.println("Remove element: " +stack.pop());
        System.out.println("Remove element: " +stack.pop());

        System.out.println("Peek element: " + stack.peek());

        stack.display();

        System.out.println("Clear the Stack");
        while (!stack.isEmpty())
            System.out.println(stack.pop());

        System.out.println("Stack is empty: " + stack.isEmpty());
    }

    private static void testLinkedQueue() {
        Queue queue = new LinkedQueueImpl();
        queue.insertRight(1);
        queue.insertRight(2);
        queue.insertRight(3);
        queue.insertRight(4);
        queue.insertRight(5);
        queue.insertRight(6);

        queue.display();

        System.out.println("Remove: " + queue.removeLeft());
        System.out.println("Remove: " + queue.removeLeft());

        queue.display();

        System.out.println("Clear the Queue");

        while (!queue.isEmpty())
            System.out.println(queue.removeLeft());

        System.out.println("Queue is empty: " + queue.isEmpty());
    }

    private static void testDoublyLinkList() {
        DoublyLinkList doublyLinkList = new DoublyLinkListImpl();

        doublyLinkList.add(1);
        doublyLinkList.add(2);
        doublyLinkList.add(3);
        doublyLinkList.add(4);

        doublyLinkList.display();

        System.out.println("Add last element");
        doublyLinkList.addLast(5);

        doublyLinkList.display();

        System.out.println("Remove first element");
        doublyLinkList.remove();

        doublyLinkList.display();

        System.out.println("Clear the LinkedList");

        while (!doublyLinkList.isEmpty())
            System.out.println(doublyLinkList.remove());

        System.out.println("LinkedList is empty: " + doublyLinkList.isEmpty());
    }

    private static void testLinkedList() {
        LinkedList list = new LinkedListImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.display();

        System.out.println("Remove element: " + list.remove());
        System.out.println("Remove element with value 8: " + list.remove(8));

        list.display();

        System.out.println("Search element with value 2: " + list.search(2));
        System.out.println("Search element with value 9: " + list.search(9));

        System.out.println("Clear the LinkedList");

        while (!list.isEmpty())
            System.out.println(list.remove());

        System.out.println("LinkedList is empty: " + list.isEmpty());
    }
}
