package Electrocar;

public class Node extends Mechanism {
    public Node(double power, double weight){
        super(power, weight);
    }
    @Override
    public void Show() {
        System.out.println("Node: power = " + getPower() + ", weight = " + getWeight());
    }
}
