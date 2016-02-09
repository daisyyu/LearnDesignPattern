package creational.singleton.example.improved;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This is an evil emperor family. Only 5 emperors may exist
 */
public class EmperorFamily {

    private static List<Emperor> instances = new ArrayList<Emperor>();

    /**
     * Private constructor so we must pass via the awake method.
     */
    private EmperorFamily(){

    }

    /**
     * Awakes the Emperor and returns it.
     *
     * @return the emperor
     */
    public synchronized static List<Emperor> awake(){
        if(instances.size()<5) {
            instances.add(new Emperor());
        }
        return instances;
    }


}
