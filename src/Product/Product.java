package Product;

public class Product {
    private String name;
    private double price;

    public Product(){
        this.name = "Unnamed";
        this.price = 0;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    String getName(){
        return name;
    }

    double getPrice(){
        return price;
    }

    public void show() {
        System.out.println("Product: " + getName());
        System.out.println("Price: $" + getPrice());
    }
}
