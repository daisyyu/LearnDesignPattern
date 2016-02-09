package behavioral.mediator.improved;


import java.util.ArrayList;

/**
 * In order to code the effective and functional Mediator. Follow the below steps for brainstorming
 * 1. Say we have A and B. We want them to be reusable, it is the best that we don't cross reference each other.
 * 2. Mediator is a chosen
 * 3. Find out What is in common for all As. In this case, All Lists will have ability to let user select one of its
 * items. selectItem().
 * 4. It is natural to form an interface exposing that method
 * <p/>
 * Android development goes the same.
 * If we have an Activity containing 2 fragments
 * Activity should act as the mediator role and bridge the communication betwwen 2 fragments.
 * In this way, any of those fragments can be reused independently.
 */
public class List {

    private java.util.List<String> items = new ArrayList<String>();


    private Screendirector screendirector;


    public void selectItem(int itemNumber) {
        String item = items.get(itemNumber);
        if (screendirector != null) {
            screendirector.itemSelected(item);
        }
    }


    public java.util.List<String> getItems() {
        return items;
    }


    public void setScreendirector(Screendirector screendirector) {
        this.screendirector = screendirector;
    }
}
