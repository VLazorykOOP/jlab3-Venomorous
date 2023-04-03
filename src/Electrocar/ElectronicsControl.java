package Electrocar;

public class ElectronicsControl extends Mechanism {
    private String controlSystem;

    public ElectronicsControl(double power, double weight, String controlSystem){
        super(power, weight);
        this.controlSystem = controlSystem;
    }

    public String getControlSystem() {
        return controlSystem;
    }
    @Override
    public void Show() {
        System.out.println("ElectronicsControl: power = " + getPower() + ", weight = " + getWeight() +
                ", controlSystem = " + controlSystem);
    }
}
