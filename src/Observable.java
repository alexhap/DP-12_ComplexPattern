/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.ArrayList;

public class Observable implements QuackObservable {

    ArrayList<Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Object observer : observers)
            ((Observer) observer).update(duck);
    }
}
