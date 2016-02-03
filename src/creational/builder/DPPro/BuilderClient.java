package creational.builder.DPPro;

/**
 * Created by fuxinyu on 1/29/16. The client only need to create a buildEngineer or Cook in this case and know which
 * kind of builder to use. This builder hard coded the behavior of individual builders Didn't allow client to set Pizza
 * properties.
 */
public class BuilderClient {
    public static void main(String[] args) {
        // create COOK
        Cook cook = new Cook();

        // Type of PizzaBuilder
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        // setting hawaiian pizza
        cook.setPizzaBuilder(hawaiianPizzaBuilder);
        cook.makePizza();
        Pizza pizza = cook.getPizza();
        System.out.println(pizza);
    }
}
