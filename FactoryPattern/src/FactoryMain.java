import factory.LAStylePizzaFactory;
import factory.NYStylePizzaFactory;
import factory.PizzaFactory;
import products.Pizza;

public class FactoryMain {
    /**
     * Simple Factory is NOT actually a design pattern.
     * Simple Factory violates Open-Close-Principle. If I go for Simple Factory,I will end up with adding dozens of if-else
     *
     *
     * Factory Method Pattern encapsulate logic creation and sub-classes decide which class to instantiate.
     * A factory is useful when you want to construct a complex object with many args to respect the DIP
     * (Dependency Inversion Principle) and avoid couplings.
     *  - Loose-coupling (No need specific classes)
     *  - Improve the Open-Close-Principle (without Factory we have a lot of if-else and what happen if remove/add?)
     *
     * Dependency Injection VS Factory Patten
     *  Dependency Injection is more of a architectural pattern for loosely coupling software components.
     *  Factory pattern is just one way to separate the responsibility of creating objects of other classes to another entity.
     *  Factory pattern can be called as a tool to implement Dependency Injection .
     *  Dependency injection can be implemented in many ways like DI using constructors, using mapping xml files etc.
     *
     *  https://stackoverflow.com/questions/46501200/simple-factory-and-factory-method-design-pattern-difference
     */

    public static void main(String[] args) {
        PizzaFactory laStylePizzaFactory = new LAStylePizzaFactory();
        PizzaFactory nyStylePizzaFactory = new NYStylePizzaFactory();

        Pizza pizza1 = laStylePizzaFactory.createPizza("cheese");
        pizza1 = nyStylePizzaFactory.createPizza("cheese");

    }
}
