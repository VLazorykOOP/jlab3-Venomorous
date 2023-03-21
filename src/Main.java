public class Main {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("Mechanism:");
        Mechanism mech = new Mechanism();
        mech.Show();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Component:");
        Component comp = new Component();
        comp.Show();

        System.out.println("----------------------------------------------------------------");
        System.out.println("Nod:");
        Node node = new Node();
        node.Show();
    }
}
