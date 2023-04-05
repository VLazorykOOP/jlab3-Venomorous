package InterfaceMathingMath;

public class ILinear implements IRoot {

    private double k;
    private double x;
    private double b;
    public ILinear(){
        this.k = 0;
        this.b = 0;
    }

    public ILinear(double k, double x, double b){
        this.k = k;
        this.b = b;
        this.x = x;
    }  public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }
    public double getX() {
        return x;
    }public void setX(double x) {
        this.x = x;
    }

    public double getB() {
        return b;
    }public void setB(double b) {
        this.b = b;
    }
     public double calculate(){
         return k * x + b;
     }

    @Override
    public double squareRoot(double value) {
        return Math.sqrt(value);
    }

    @Override
    public void print() {
        System.out.println("-------------------------------------------------------------------------");
//        System.out.println("Linear equation:");
        System.out.println("Linear equation: y = " + "kx + b = " + k + " * " + x + " + " + b);
        System.out.println("The result of linear equation is: " + calculate());
        System.out.println("-------------------------------------------------------------------------");
    }
}
