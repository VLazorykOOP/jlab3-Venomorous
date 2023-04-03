package Other;

public class Mechanism extends Product{

    protected boolean isWorking;
    public Mechanism(){
        this.isWorking = false;
    }

    @Override
    public void Show() {
        super.Show();
        if(isWorking){
        System.out.println("Other.Mechanism is working");
        }else{
            System.out.println("Other.Mechanism isn't working");
        }
    }
}
