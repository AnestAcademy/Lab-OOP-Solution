package entity;

import util.IConstant;
import util.Validate;

import java.util.List;

public class Fruit {

    private int fruitId;
    private String fruitName;
    private float price;
    private int quantity;
    private String origin;

    public Fruit() {
    }

    public Fruit(int fruitId, String fruitName, float price, int quantity, String origin) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.quantity = quantity;
        this.origin = origin;
    }

    public int getFruitId() {
        return fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Display list fruit.
     */
    public void display(int no) {
        System.out.format("%7d %19s %16s %10.0f$\n",
                no,
                String.format("%1$-8s", this.fruitName),
                String.format("%1$-8s", this.origin),
                this.price
        );
    }

    /**
     * Tests whether the fruit exists.
     *
     * @param list the list to store fruit
     * @param id   the id to test
     * @return <code>true</code> if fruit exists; <code>false</code> otherwise
     */
    private boolean exists(List<Fruit> list, int id) {
        return list.stream().anyMatch(f -> (f.getFruitId() == id));
    }

    /**
     * Returns fruit id.
     *
     * @param list the list to store fruit
     * @return the integer value
     */
    private int getId(List<Fruit> list) {
        do {
            int id = Validate.getInt("Enter fruit ID: ", "Numeric value out of range.", 1, Integer.MAX_VALUE);
            if (!exists(list, id)) {
                return id;
            }
            System.out.println("ID is exist, try again.");
        } while (true);
    }

    /**
     * Create a fruit.
     *
     * @param list the list to store fruit
     */
    public void input(List<Fruit> list) {
        this.fruitId = getId(list);
        this.fruitName = Validate.getString("Enter fruit name: ", "Invalid fruit name.", IConstant.FRUIT_NAME);
        this.price = Validate.getFloat("Enter price: ", 0, Float.MAX_VALUE);
        this.quantity = Validate.getInt("Enter quantity: ", "Numeric value out of range.", 1, Integer.MAX_VALUE);
        this.origin = Validate.getString("Enter fruit origin: ", "Invalid fruit origin.", IConstant.ORIGIN);
    }
}
