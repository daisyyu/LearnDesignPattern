package creational.builder.DPPro;

/**
 * Created by fuxinyu on 1/29/16.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("CROSS");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("MILD");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("HAM and PINEAPPLE");

    }
}
