package baseline;

public class Product {
    private String name;
    private float price;
    private short quantity;

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public short getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }
}
