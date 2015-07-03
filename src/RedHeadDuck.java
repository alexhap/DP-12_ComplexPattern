/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.Observable;

public class RedHeadDuck extends Observable implements Quackable {

    public void quack() {
        System.out.println("Quack");
    }

    public String toString() {
        return "Redhead Duck";
    }
}
