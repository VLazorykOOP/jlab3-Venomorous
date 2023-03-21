public abstract class Product {
    protected String Date;

    public Product(){
        this.Date = "Unknown";
    }

    public void Show(){
        System.out.println("Date of manufacture: " + this.Date);
    }
}
