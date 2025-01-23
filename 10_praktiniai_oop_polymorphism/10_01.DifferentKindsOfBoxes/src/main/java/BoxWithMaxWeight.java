import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> ItemsInBox;

    public BoxWithMaxWeight(int capacity) {
        maxWeight = capacity;
        ItemsInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (maxWeight >= item.getWeight()) {
            maxWeight -= item.getWeight();
            ItemsInBox.add(item);
        } else System.out.println("Box is full");
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : ItemsInBox) {
            if(i.equals(item)){
                return true;
            }
        }
        return false;
    }
}
