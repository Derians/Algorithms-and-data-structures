import java.util.LinkedList;

/**
 * Created by Ivan Chaykin
 * Date: 02.11.2018
 * Time: 16:57
 */
public class LinkedHashTable {

    private LinkedList<Item>[] hashTable;

    public LinkedHashTable(int maxSize) {
        this.hashTable = new LinkedList[maxSize];
    }

    public void insert(Item item) {
        int index = hashFunc(item);
        if (hashTable[index] == null)
            hashTable[index] = new LinkedList<>();

        hashTable[index].add(item);
    }

    public int hashFunc(int key) {
        return key % hashTable.length;
    }

    public int hashFunc(Item item) {
        return hashFunc(item.hashCode());
    }

    public void display() {
        for (LinkedList<Item> items : hashTable) {
//            if (items != null)
                System.out.println(items);
        }
    }

    public boolean remove(Item item) {
        int index = hashFunc(item);
        return hashTable[index].remove(item);
    }

    public boolean remove(int key) {
        int index = hashFunc(key);
        if (hashTable[index] != null) {
            Item currentItem = find(key);
            if (currentItem != null)
                return remove(currentItem);
        }
        return false;
    }

    public Item find(Item item) {
        Item currentItem = find(item.getData());
        if (currentItem != null)
            return currentItem;
        return null;
    }

    public Item find(int key) {
        int index = hashFunc(key);
        if (hashTable[index] != null) {
            for (Item item : hashTable[index]) {
                if (item.getData() == key)
                    return item;
            }
        }
        return null;
    }
}
