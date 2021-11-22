package factory;

import products.LACheesePizza;
import products.LAPiperoniPizza;
import products.Pizza;

public class LAStylePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")){
            pizza = new LACheesePizza();
        } else if (type.equals("piperoni")){
            pizza = new LAPiperoniPizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}
