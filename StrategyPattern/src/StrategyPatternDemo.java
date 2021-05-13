public class StrategyPatternDemo {

    public static void main(String[] args) {
        Duck duck = new Duck(new HorizontalFly());
        System.out.println(duck.executeFlyableStrategy());

        duck = new Duck(new VerticalFly());
        System.out.println(duck.executeFlyableStrategy());
    }
}
