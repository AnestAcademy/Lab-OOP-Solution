package bo;

import entity.Fruit;
import entity.Item;
import util.Helper;
import util.IConstant;
import util.Validate;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderBo {

    private Hashtable<String, List<Item>> listOrder;

    public OrderBo() {
        listOrder = new Hashtable<>();
    }

    public OrderBo(Hashtable<String, List<Item>> listOrder) {
        this.listOrder = listOrder;
    }

    /**
     * Add order and customer info.
     *
     * @param listFruit the list to store fruit
     */
    public void addOrder(List<Fruit> listFruit) {
        List<Item> listItem = new ArrayList<>();
        addItems(listFruit, listItem);
        String customerName = getCustomerName(listItem);

        this.listOrder.put(customerName, listItem);
    }

    /**
     * Add item to list order.
     *
     * @param listFruit the list to store fruit
     * @param listItem  the list to store item of the order
     */
    private void addItems(List<Fruit> listFruit, List<Item> listItem) {
        do {
            int selectItem = Validate.getInt(
                    "\nEnter select item: ",
                    "Only choice [1 - " + listFruit.size() + "].",
                    1,
                    listFruit.size()
            );

            Fruit fruit = listFruit.get(selectItem - 1);

            System.out.println("You selected: " + fruit.getFruitName());
            int quantity = Validate.getInt(
                    "Please input quantity: ",
                    "Only choice [1 - " + fruit.getQuantity() + "].",
                    1,
                    fruit.getQuantity()
            );
            updateQuantity(listFruit, fruit.getFruitId(), quantity);

            int index = getIndexItem(listItem, fruit.getFruitId());
            if (index > -1) {
                Item item = listItem.get(index);
                item.setQuantity(item.getQuantity() + quantity);
                item.setAmount(item.getQuantity() * item.getPrice());
            } else {
                listItem.add(new Item(
                        fruit.getFruitId(),
                        fruit.getFruitName(),
                        quantity,
                        fruit.getPrice(),
                        quantity * fruit.getPrice()
                )
                );
            }
        } while (!Helper.isContinue("Do you want to order now (Y/N)? "));
    }

    /**
     * Update the quantity of fruit.
     *
     * @param listFruit        the list to store fruit
     * @param id               id to update
     * @param quantitySelected quantity selected
     */
    private void updateQuantity(List<Fruit> listFruit, int id, int quantitySelected) {
        for (Fruit fruit : listFruit) {
            if (fruit.getFruitId() == id) {
                fruit.setQuantity(fruit.getQuantity() - quantitySelected);
            }
        }
    }

    /**
     * Returns index item if exists in the list item.
     *
     * @param listItem  the list to store item of the order
     * @param id        the id to check
     * @return the integer value
     */
    private int getIndexItem(List<Item> listItem, int id) {
        for (int i = 0; i < listItem.size(); ++i) {
            if (listItem.get(i).getProductId() == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the name of customer.
     *
     * @param listItem the list to store item of the order
     * @return the string value
     */
    private String getCustomerName(List<Item> listItem) {
        displayListItem(listItem);
        System.out.format("Total: %.0f$\n", getTotalPrice(listItem));
        return Validate.getString("Input your name: ", "Invalid name.", IConstant.CUSTOMER_NAME);
    }

    /**
     * Returns total price of order.
     *
     * @param listItem the list to store item of the order
     * @return the float value
     */
    private float getTotalPrice(List<Item> listItem) {
        return listItem.stream().map(o -> o.getAmount()).reduce(0f, Float::sum);
    }

    /**
     * Display list order.
     */
    public void displayListOrder() {
        this.listOrder.forEach((k, v) -> {
            System.out.println("\nCustomer: " + k);
            System.out.println("Product  |  Quantity  |  Price  |  Amount");

            AtomicInteger no = new AtomicInteger();
            v.forEach(o -> {
                no.incrementAndGet();
                o.display(no.get());
            });
            System.out.format("Total: %.0f$\n", getTotalPrice(v));
        });
    }

    /**
     * Display list item.
     * 
     * @param listItem the list to store item of the order
     */
    private void displayListItem(List<Item> listItem) {
        System.out.println("\nProduct  |  Quantity  |  Price  |  Amount");

        AtomicInteger no = new AtomicInteger();
        listItem.forEach(i -> {
            no.incrementAndGet();
            i.display(no.get());
        });
    }
}
