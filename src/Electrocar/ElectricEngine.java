package Electrocar;

public class ElectricEngine extends Mechanism {
    private double maximumTorque;
    public ElectricEngine(double power, double weight, double maximumTorque){
        super(power, weight);
        this.maximumTorque = maximumTorque;
    }

    public double getMaximumTorque() {
        return maximumTorque;
    }
    @Override
    public void Show() {
        System.out.println("ElectricEngine: power = " + getPower() + ", weight = " + getWeight() +
                ", maximumTorque = " + maximumTorque);
    }
}
