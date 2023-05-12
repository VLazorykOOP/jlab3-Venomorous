package Product;

public class Mechanism extends Component {
    private String type;

    public Mechanism(){
        super();
        this.type = "Unknown";
    }
    public Mechanism(String name, double price, String material, String type) {
        super(name, price, material);
        this.type = type;
    }

    public boolean setType(String type) {
        this.type = type;
        return true;
    }

    public String getType() {
        return type;
    }

    @Override
    public void show() {
        System.out.println("Mechanism:");
        super.show();
        System.out.println("Mechanism Type: " + getType());
    }
}
