import java.util.ArrayList;

/**
 * Created by Derians
 * Date: 24.10.2018
 * Time: 23:02
 */
public class Backpack {

    private ArrayList<Item> bestItemsSet = null;

    private int backpackCapacity;
    private int bestAmount;

    public Backpack(int backpackCapacity){
        this.backpackCapacity = backpackCapacity;
    }

    private int calcSetCost(ArrayList<Item> items){
        int amount = 0;
        for (Item item : items)
            amount += item.getPrice();

        return amount;
    }

    private int calcSetWeigth(ArrayList<Item> items){
        int weigth = 0;
        for (Item item : items)
            weigth += item.getWeight();

        return weigth;
    }

    private void checkBestSet(ArrayList<Item> items){
        if (bestItemsSet == null) {
            if (calcSetWeigth(items) <= backpackCapacity){
                bestItemsSet = items;
                bestAmount = calcSetCost(items);
            }
        } else {
            if(calcSetWeigth(items) <= backpackCapacity && calcSetCost(items) > bestAmount){
                bestItemsSet = items;
                bestAmount = calcSetCost(items);
            }
        }
    }

    public void findAllSets(ArrayList<Item> items){
        if (items.size() > 0)
            checkBestSet(items);

        for (int i = 0; i < items.size(); i++){
            ArrayList<Item> tempSet = new ArrayList<>(items);
            tempSet.remove(i);

            findAllSets(tempSet);
        }
    }

    public ArrayList<Item> getBestItemsSet(){
        return bestItemsSet;
    }
}
