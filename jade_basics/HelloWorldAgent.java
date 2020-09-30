import jade.core.Agent;

public class HelloWorldAgent extends Agent{
    public void setup() {
        this.addBehaviour(new WorkingBehaviour());
    }
}
