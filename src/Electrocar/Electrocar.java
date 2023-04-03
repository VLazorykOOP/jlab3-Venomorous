package Electrocar;

import Other.Node;

public class Electrocar {
    private double power;
    private double weight;

    public Electrocar(double power, double weight){
        this.power = power;
        this.weight = weight;
    }

    public double getPower() {
        return power;
    }

    public double getWeight() {
        return weight;
    }
}
