package Product;

public class Component extends Product {
    private String material;

    public Component(){
        super();
        this.material = "Unknown";
    }
    public Component(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Material: " + getMaterial());
    }
}
