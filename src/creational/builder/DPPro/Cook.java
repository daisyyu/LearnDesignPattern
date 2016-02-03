package creational.builder.DPPro;

/**
 * Created by fuxinyu on 1/29/16. Also known as build engineer
 */
public class Cook {
    public PizzaBuilder getPizzaBuilder() {
        return pizzaBuilder;
    }

    public void setPizzaBuilder(final PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    protected PizzaBuilder pizzaBuilder;

    public Cook() {
        System.out.println("Mr Samal COOK is making Pizza");

    }

    public void makePizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

}
