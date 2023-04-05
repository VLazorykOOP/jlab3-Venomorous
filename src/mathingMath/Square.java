package mathingMath;
public class Square extends Root {

    private double a;
    private double b;
    private double c;
    private double x;

    public Square() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.x = 0;
    }
    public Square(double a, double b, double c, double x) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getX() {
        return x;
    }public void setX(double x) {
        this.x = x;
    }
    @Override
    public double squareRoot(double value) {
        return Math.sqrt(value);
    }

    public double calculate() {
        return a * x * x + b * x + c;
    }

    public void print() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Quadratic equation: " + "ax^2 + bx + c" + " = " + a + " * " + x*x + " + " + b + " * " + x + " + " + c);
        System.out.println("The result of linear equation is: " + calculate());
        System.out.println("-------------------------------------------------------------------------");
    }
}
