package creational.builder.DPPro;

/**
 * Created by fuxinyu on 1/29/16. Different PizzaBuilders knows how to create different kinds of pizzas
 */
public abstract class PizzaBuilder {
    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(final Pizza pizza) {
        this.pizza = pizza;
    }

    protected Pizza pizza;

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();

}
