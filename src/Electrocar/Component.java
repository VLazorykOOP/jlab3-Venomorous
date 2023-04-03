package Electrocar;

public class Component extends Node {
    public Component(double power, double weight){
        super(power, weight);
    }
    @Override
    public void Show() {
        System.out.println("Component: power = " + getPower() + ", weight = " + getWeight());
    }
}
