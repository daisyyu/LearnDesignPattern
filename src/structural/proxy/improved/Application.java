package structural.proxy.improved;


import java.util.ArrayList;
import java.util.List;

/**
 * Notice that the Application class is not changed at all
 */
public class Application {

    private List<Image> images = new ArrayList<Image>();

    public Application(List<Image> images) {
        this.images = images;
    }

    public void draw(){
        for (Image image : images) {
            image.draw();
        }
    }

}
