package Inventory.com;

public class item {
    private String name;
    private int quantity;
    private double price;

    public item(String name , int quantity, double price){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item { Name ='" +name + "', Quantity =" +quantity + ", Price =" +price + "}";
    }
}
