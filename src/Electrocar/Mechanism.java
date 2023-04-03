package Electrocar;

public class Mechanism extends Product {
    public Mechanism(double power, double weight){
        super(power, weight);
    }
    @Override
    public void Show() {
        System.out.println("Mechanism: power = " + getPower() + ", weight = " + getWeight());
    }
}
