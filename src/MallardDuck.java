/**
 * Created by alex on 03.07.2015.
 *
 */

public class MallardDuck implements Quackable {

    private Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public String toString() {
        return "Mallard Duck";
    }
}
