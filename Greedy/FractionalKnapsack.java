import java.util.*;

class Item {
    int value, weight;

    Item(int v, int w) {
        value = v;
        weight = w;
    }
}

class FractionalKnapsack {

    static double getMaxValue(Item[] items, int W) {
        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;
                return Double.compare(r2, r1); // Descending
            }
        });

        double maxValue = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (W >= items[i].weight) {
                maxValue += items[i].value;
                W -= items[i].weight;
            } else {
                maxValue += (double) items[i].value * W / items[i].weight;
                break;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };
        int W = 50;
        System.out.println("Maximum value: " + getMaxValue(items, W));
    }
}
