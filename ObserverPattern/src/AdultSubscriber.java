public class AdultSubscriber implements Subscriber{
    final private Publisher newsletter;

    public AdultSubscriber(Publisher publisher){
        this.newsletter = publisher;
        this.newsletter.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Adult got notified. Current Publisher state is " + newsletter.getState());
    }
}
