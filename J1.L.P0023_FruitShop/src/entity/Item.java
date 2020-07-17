package entity;

public class Item {

    private int productId;
    private String product;
    private int quantity;
    private float price;
    private float amount;

    public Item() {
    }

    public Item(int productId, String product, int quantity, float price, float amount) {
        this.productId = productId;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void display(int no) {
        System.out.format("%d.%10s %4d %10.0f$ %8.0f$\n",
                no,
                String.format("%1$-10s", this.product),
                this.quantity,
                this.price,
                this.amount);
    }
}
