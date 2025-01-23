import java.util.ArrayList;

public class Box implements Packable {
    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (maxCapacity >= item.weight()) {
            items.add(item);
            maxCapacity -= item.weight();
        } else System.out.println("Over capacity.");
    }

    @Override
    public double weight() {
        double totalWeight = 0.0;
        for (Packable item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
