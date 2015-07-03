/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.ArrayList;

public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers)
            quacker.registerObserver(observer);
    }

    public void notifyObservers() { }

    public void quack() {
        for (Quackable quacker : quackers)
            quacker.quack();
    }
}
