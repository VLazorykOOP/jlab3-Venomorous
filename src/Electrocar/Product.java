package Electrocar;

public class Product {
    private double power;
    private double weight;
    public Product(double power, double weight){
        this.power = power;
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public double getWeight() {
        return weight;
    }
    public void Show() {
        System.out.println("Product: power = " + power + ", weight = " + weight);
    }
}