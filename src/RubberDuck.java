/**
 * Created by alex on 03.07.2015.
 *
 */

public class RubberDuck implements Quackable {

    private Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void quack() {
        System.out.println("Squeack");
        notifyObservers();
    }

    public String toString() {
        return "Rubber Duck";
    }
}
