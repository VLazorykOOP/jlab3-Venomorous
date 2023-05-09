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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Mechanism Type: " + getType());
    }
}
