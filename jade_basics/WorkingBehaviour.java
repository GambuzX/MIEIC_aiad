import jade.core.behaviours.Behaviour;

public class WorkingBehaviour extends Behaviour {

    int n = 0;

    @Override
    public void action() {
        System.out.println(++n);
    }

    @Override
    public boolean done() {
        return n == 3;
    }
}
