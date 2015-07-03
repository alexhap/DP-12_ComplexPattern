/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.Observable;

public class MallardDuck extends Observable implements Quackable {

    public void quack() {
        System.out.println("Quack");
    }

    public String toString() {
        return "Mallard Duck";
    }
}
