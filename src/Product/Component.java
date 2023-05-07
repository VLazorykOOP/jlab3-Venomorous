package Product;

public class Component extends Product {
    private String material;

    public Component(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Material: " + material);
    }
}
