package factory;

import products.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String type);
}
