import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    private int state;

    public void attach(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void notifyAllOSubscribers(){
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllOSubscribers();
    }
}
