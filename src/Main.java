import Electrocar.*;
import InterfaceMathingMath.*;
import mathingMath.*;
//import Other.Component;
//import Other.Mechanism;
//import Other.Node;


//        System.out.println("----------------------------------------------------------------");
//        System.out.println("Other.Mechanism:");
//        Mechanism mech = new Mechanism();
//        mech.Show();
//
//        System.out.println("----------------------------------------------------------------");
//        System.out.println("Other.Component:");
//        Component comp = new Component();
//        comp.Show();
//
//        System.out.println("----------------------------------------------------------------");
//        System.out.println("Nod:");
//        Node node = new Node();
//        node.Show();

//    Battery battery = new Battery(100,50,500,200);
//    ElectronicsControl electronics = new ElectronicsControl(100,20, "Intelligent control system");
//    SteeringMechanism steering  = new SteeringMechanism(100,30,"Electric steering mechanism");
//
//    Electrocar car = new Electrocar(300,500);
public class Main {
    public static void main(String[] args) {

        //-------------------------------------------------------------------------
        //Car1
//        System.out.println("Car 1:");
//        ElectricEngine engine = new ElectricEngine(100, 200, 300);
//        Battery battery = new Battery(50, 100, 500, 1000);
//        ElectronicsControl electronics = new ElectronicsControl(10, 20, "SmartControl");
//        SteeringMechanism steering = new SteeringMechanism(5, 10, "PowerSteering");
//        Component component = new Component(2, 5);
//
//
//        engine.Show();
//        battery.Show();
//        electronics.Show();
//        steering.Show();
//        component.Show();
//        System.out.println("-------------------------------------------------------------------------");
        //-------------------------------------------------------------------------
//        System.out.println("Electric Engine maximum torque: " + engine.getMaximumTorque());
//        System.out.println("Battery power: " + battery.getBatteryPower() + ", capacity: " + battery.getCapacity());
//        System.out.println("Electronics control system: " + electronics.getControlSystem());
//        System.out.println("Steering type: " + steering.getSteeringType());
//        System.out.println("Component power: " + component.getPower() + ", weight: " + component.getWeight());


        // Abstract class Root
        System.out.println("Root is abstract class");
        Linear lin = new Linear(1, 2, 3);
//        double Root = lin.squareRoot(5);
//        System.out.println("Root: " + Root);
        lin.print();
        lin.setX(10);
        lin.print();

        //-------------------------------------------------------------------------
        Square quad = new Square(1,2,3, 4);
        quad.print();

        // Interface Root
        System.out.println("=========================================================================");
        System.out.println("Root is an interface");
        ILinear Ilin = new ILinear(4,5,6);
        Ilin.print();


        //-------------------------------------------------------------------------
        ISquare Iquad = new ISquare(5,6,7, 8);
        Iquad.print();
    }
}

