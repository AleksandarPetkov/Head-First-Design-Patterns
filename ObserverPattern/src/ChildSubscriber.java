public class ChildSubscriber implements Subscriber{
    final private Publisher newsletter;

    public ChildSubscriber(Publisher publisher){
        this.newsletter = publisher;
        this.newsletter.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Child got notified. Current Publisher state is " + newsletter.getState());
    }
}
