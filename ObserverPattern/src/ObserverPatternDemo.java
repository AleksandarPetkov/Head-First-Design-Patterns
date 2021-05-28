public class ObserverPatternDemo {
    /**
     Observer pattern is a behavioral pattern and defines one-to-many dependency between objects
     so when one object change its state all of its dependencies are notified and updated automatically

     Example: https://refactoring.guru/design-patterns/observer
     Example: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
     */
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber child = new ChildSubscriber(publisher);
        Subscriber adult = new AdultSubscriber(publisher);

        System.out.println("First state change: 15");
        publisher.setState(15);
        System.out.println("Second state change: 10");
        publisher.setState(10);
    }
}
