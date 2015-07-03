/**
 * Created by alex on 03.07.2015.
 *
 */

public class DuckCall implements Quackable {

    private Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public String toString() {
        return "Duck Call";
    }
}
