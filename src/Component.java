public class Component extends Product {
    protected double size;

    public Component(){
        this.size = 0;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Size of a component: " + this.size + "cm");
    }
}
