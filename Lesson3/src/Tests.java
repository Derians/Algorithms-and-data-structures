/**
 * Created by Ivan Chaykin
 * Date: 16.10.2018
 * Time: 20:35
 */
public class Tests {

    public static void main(String[] args) {

//        stackTest();
//        bracketTest();
//        queueTest();
//        priorityQueueTest();
//        DequeTest();

    }

    private static void DequeTest() {

        Deque deque = new DequeImpl(5);
        int index = 1;

        System.out.println("Fill deque");
        while (!deque.isFull())
            deque.insertRight(index++);
        deque.display();

        System.out.println("Remove left element: " + deque.removeLeft());
        deque.display();
        System.out.println("Remove right element: " + deque.removeRight());
        deque.display();
        System.out.println("Insert left element: ");
        deque.insertLeft(11);
        deque.display();
        System.out.println("Insert right element: ");
        deque.insertRight(55);
        deque.display();

        System.out.println("Remove all elements");
        while (!deque.isEmpty())
            deque.removeRight();
        System.out.println("Deque is empty: " + deque.isEmpty());

        System.out.println("Fill deque");
        index = 1;
        while (!deque.isFull())
            deque.insertLeft(index++ * 10);
        deque.display();
        System.out.println("Deque is full: " + deque.isFull());
    }


    private static void priorityQueueTest() {
        PriorityQueue queue = new PriorityQueue(5);
        queue.insertRight(20);
        queue.insertRight(40);
        queue.insertRight(50);
        queue.insertRight(10);
        queue.insertRight(30);

        while (!queue.isEmpty())
            System.out.println(queue.removeLeft());

        System.out.println("PriorityQueue is empty: " + queue.isEmpty());
    }

    private static void queueTest() {

        Queue queue = new QueueImpl(5);

        addToQueue(queue, 1);
        addToQueue(queue, 2);
        addToQueue(queue, 3);
        addToQueue(queue, 4);
        addToQueue(queue, 5);
        addToQueue(queue, 6);

        queue.display();
        System.out.println("Remove element: " + queue.removeLeft());
        System.out.println("Remove element: " + queue.removeLeft());
        queue.display();

        while (!queue.isEmpty())
            queue.removeLeft();

        System.out.println("Queue is empty: " + queue.isEmpty());
    }

    private static void addToQueue(Queue queue, int value) {
        if (!queue.isFull())
            queue.insertRight(value);
    }

    private static void bracketTest() {
        System.out.println("test bracket:");
        String in = "    public static void main(String[] args) {        testStack();    ";
        new Bracket(in).check();
        System.out.println("finish check bracket");
    }

    private static void stackTest() {
        Stack stack = new StackImpl(5);
        System.out.println(stack.isEmpty());
        stack.push(20);
        stack.push(10);
        stack.push(40);
        stack.push(30);
        stack.push(50);

        System.out.println(stack.isFull());
        stack.display();

        stack.peek();
        System.out.println("   ");

        stack.display();
        System.out.println("   ");

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();
        System.out.println("   ");

        System.out.println(stack.isEmpty());
    }
}