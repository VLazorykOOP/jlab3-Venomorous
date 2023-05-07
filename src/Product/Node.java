package Product;

public class Node extends Component {
    private int nodeId;

    public Node(String name, double price, String material, int nodeId) {
        super(name, price, material);
        this.nodeId = nodeId;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Node ID: " + nodeId);
    }
}
