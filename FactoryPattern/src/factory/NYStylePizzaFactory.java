package factory;

import products.*;

public class NYStylePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")){
            pizza = new NYCheesePizza();
        } else if (type.equals("piperoni")){
            pizza = new NYPiperoniPizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
