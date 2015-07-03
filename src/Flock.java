/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.ArrayList;
import java.util.Observable;

public class Flock extends Observable implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
            if (!(quacker instanceof Flock)) {
                setChanged();
                notifyObservers(quacker.toString());
            }
        }
    }
}
