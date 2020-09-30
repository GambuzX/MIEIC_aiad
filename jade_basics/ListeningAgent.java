import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

// https://l.facebook.com/l.php?u=https%3A%2F%2Fmoodle.up.pt%2Fpluginfile.php%2F67448%2Fmod_resource%2Fcontent%2F1%2FJADECrashCourse.pdf

public class ListeningAgent extends Agent {
    public void setup() {
        addBehaviour(new ListeningBehaviour());
    }

    class ListeningBehaviour extends CyclicBehaviour {
        public void action() {
            ACLMessage msg = receive();
            if (msg != null) {
                System.out.println(msg);
                ACLMessage reply = msg.createReply();
                reply.setPerformative(ACLMessage.INFORM);
                reply.setContent("Got your message bro");
                send(reply);
            }
            else {
                block();
            }
        }
    }
}
