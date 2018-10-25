/**
 * Created by Ivan Chaykin
 * Date: 23.10.2018
 * Time: 15:51
 */
public class Item {

    private String name;

    private int weight;

    private int price;

    public Item(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

}
