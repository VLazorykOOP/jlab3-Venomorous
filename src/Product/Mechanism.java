package Product;

public class Mechanism extends Component {
    private String type;

    public Mechanism(String name, double price, String material, String type) {
        super(name, price, material);
        this.type = type;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Mechanism Type: " + type);
    }
}
