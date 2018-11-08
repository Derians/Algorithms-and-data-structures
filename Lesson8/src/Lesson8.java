/**
 * Created by Ivan Chaykin
 * Date: 02.11.2018
 * Time: 17:39
 */
public class Lesson8 {

    public static void main(String[] args) {
        testLinkedHashTable();
    }

    private static void testLinkedHashTable() {
        LinkedHashTable linkedHashTable = new LinkedHashTable(10);

        Item item1 = new Item(2);
        Item item2 = new Item(7);
        Item item3 = new Item(32);
        Item item4 = new Item(15);
        Item item5 = new Item(17);

        linkedHashTable.insert(item1);
        linkedHashTable.insert(item2);
        linkedHashTable.insert(item3);
        linkedHashTable.insert(item4);
        linkedHashTable.insert(item5);

        linkedHashTable.display();

        System.out.println("---");

        System.out.println("Find 15:" + linkedHashTable.find(item4));
        System.out.println("Find 32:" + linkedHashTable.find(item3));

        System.out.println("Try to remove 2:" + linkedHashTable.remove(item1));
        System.out.println("Try to remove 22:" + linkedHashTable.remove(22));
        System.out.println("Try to remove 17:" + linkedHashTable.remove(17));

        System.out.println("Find 2:" + linkedHashTable.find(item1));
        System.out.println("Find 17:" + linkedHashTable.find(17));
        System.out.println("Find 22:" + linkedHashTable.find(22));

        System.out.println("---");

        linkedHashTable.display();
    }
}