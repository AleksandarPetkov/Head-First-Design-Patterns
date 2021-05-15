public class StrategyPatternDemo {

    /**
     In Strategy pattern, a class behavior or its algorithm can be changed at run time.
     In Strategy pattern, we create objects which represent various strategies and a context object,
     whose behavior varies as per its strategy object.
     The strategy object changes the executing algorithm of the context object.
     We Using more composition rather than inheritance.
     The key element is: Constructor Injection in Duck *

     Youtube video: https://www.youtube.com/watch?v=v9ejT8FO-7I&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
     Example:       https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
     */
    public static void main(String[] args) {
        // In this case Duck change its behavior into HorizontalFly Runtime
        Duck duck = new Duck(new HorizontalFly());
        System.out.println(duck.executeFlyableStrategy());

        // In this case Duck change its behavior into VerticalFly Runtime
        duck = new Duck(new VerticalFly());
        System.out.println(duck.executeFlyableStrategy());
    }
}
