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
    public void SetName(String name){
        this.name = name;
    }
    public void SetPrice(double price){
        this.price = price;
    }

    String GetName(){
        return name;
    }

    double GetPrice(){
        return price;
    }

    public void show() {
        System.out.println("Product: " + GetName());
        System.out.println("Price: $" + GetPrice());
    }
}
