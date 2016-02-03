package creational.builder.DPPro;

/**
 * Created by fuxinyu on 1/29/16.
 */
public class Pizza {
    public String getDough() {
        return dough;
    }

    public void setDough(final String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(final String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(final String topping) {
        this.topping = topping;
    }

    protected String dough = "";
    protected String sauce = "";
    protected String topping = "";

    @Override
    public String toString() {
        return "Pizza [Dough:" + dough + ".SAUCE:" + sauce + ".TOPPING:" + topping + "]";
    }
}
