public class Mechanism extends Component{

    protected boolean isWorking;
    public Mechanism(){
        this.isWorking = false;
    }

    @Override
    public void Show() {
        super.Show();
        if(isWorking){
        System.out.println("Mechanism is working");
        }else{
            System.out.println("Mechanism isn't working");
        }
    }
}
