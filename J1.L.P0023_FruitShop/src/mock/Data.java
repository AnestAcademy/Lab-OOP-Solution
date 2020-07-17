package mock;

import entity.Fruit;
import entity.Item;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Mock initial data.
 */
public class Data {

    public static List<Fruit> listFruit = new ArrayList<Fruit>() {
        {
            add(new Fruit(1, "Coconut", 2, 10, "Vietnam"));
            add(new Fruit(2, "Orange", 3, 10, "US"));
            add(new Fruit(3, "Apple", 4, 10, "Thailand"));
            add(new Fruit(4, "Grape", 6, 10, "France"));
            add(new Fruit(5, "Mango", 2, 10, "Vietnam"));
        }
    };

    private static List<Item> listItemsBought1 = new ArrayList<Item>() {
        {
            add(new Item(3, "Apple", 3, 4, 12));
            add(new Item(5, "Mango", 2, 2, 4));
        }
    };

    private static List<Item> listItemsBought2 = new ArrayList<Item>() {
        {
            add(new Item(1, "Coconut", 3, 2, 6));
            add(new Item(5, "Mango", 2, 2, 4));
        }
    };

    public static Hashtable<String, List<Item>> listOrder = new Hashtable<String, List<Item>>() {
        {
            put("Marry Carie", listItemsBought1);
            put("John Smith", listItemsBought2);
        }
    };
}
