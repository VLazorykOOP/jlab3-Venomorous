package Electrocar;

public class Battery extends Mechanism {
    private double batteryPower;
    private double capacity;
    public Battery(double power, double weight, double batteryPower, double capacity){
        super(power, weight);
        this.batteryPower = batteryPower;
        this.capacity = capacity;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public double getCapacity() {
        return capacity;
    }
    @Override
    public void Show() {
        System.out.println("Battery: power = " + getPower() + ", weight = " + getWeight() +
                ", batteryPower = " + batteryPower + ", capacity = " + capacity);
    }
}
