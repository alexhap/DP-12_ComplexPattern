/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.Observable;
import java.util.Observer;

public class Quackologist implements Observer {

    public void update(Observable duck, Object arg) {
        System.out.println("Quackologist: " + arg + " just quacked.\n");
    }
}
