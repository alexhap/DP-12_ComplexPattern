/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.Observable;

public class DuckCall extends Observable implements Quackable {

    public void quack() {
        System.out.println("Kwak");
    }

    public String toString() {
        return "Duck Call";
    }
}
