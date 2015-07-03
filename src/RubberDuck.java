/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.Observable;

public class RubberDuck extends Observable implements Quackable {

    public void quack() {
        System.out.println("Squeack");
    }

    public String toString() {
        return "Rubber Duck";
    }
}
