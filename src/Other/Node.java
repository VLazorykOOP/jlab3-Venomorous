package Other;

public class Node extends Component{
    protected String type;

    public Node(){
        this.type = "Unknown";
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Type of a node: " + this.type);
    }
}
