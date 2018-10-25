import java.util.ArrayList;

/**
 * Created by Ivan Chaykin
 * Date: 23.10.2018
 * Time: 10:34
 */
public class Lesson5 {

    public static void main(String[] args) {

        int backpackCapacity = 5;

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Книга", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));

        Backpack backpack = new Backpack(backpackCapacity);
        backpack.findAllSets(items);

        System.out.println("Содержимое рюкзака: ");
        for (Item item : backpack.getBestItemsSet()) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println();
        System.out.println("Проверка возведения в степень:");

        Exponent exponent = new Exponent();

        System.out.println("0^0  (Ожидаем: 1) = " + exponent.exponentiation(0, 0));
        System.out.println("0^2  (Ожидаем: 0) = " + exponent.exponentiation(0, 2));
        System.out.println("0^-2 (Ожидаем: Infinity) = " + exponent.exponentiation(0, -2));
        System.out.println("2^-2 (Ожидаем: 0.25) = " + exponent.exponentiation(2, -2));
        System.out.println("2^0  (Ожидаем: 1) = " + exponent.exponentiation(2, 0));
        System.out.println("5^3  (Ожидаем: 125) = " + exponent.exponentiation(5, 3));

    }
}








