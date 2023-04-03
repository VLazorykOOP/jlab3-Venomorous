package Electrocar;

public class SteeringMechanism extends Mechanism {
    private String steeringType;
    public SteeringMechanism(double power, double weight, String steeringType){
        super(power, weight);
        this.steeringType = steeringType;
    }

    public String getSteeringType() {
        return steeringType;
    }
    @Override
    public void Show() {
    System.out.println("SteeringMechanism: power = " + getPower() + ", weight = " + getWeight() + ", steeringType = " + steeringType);
    }
}
