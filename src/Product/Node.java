package Product;

public class Node extends Component {
    private int nodeId;

    public Node(){
        super();
        this.nodeId = 0;
    }
    public Node(String name, double price, String material, int nodeId) {
        super(name, price, material);
        this.nodeId = nodeId;
    }

    public void SetNodeId(int nodeId){
        this.nodeId = nodeId;
    }

    public int getNodeId() {
        return nodeId;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Node ID: " + getNodeId());
    }
}
