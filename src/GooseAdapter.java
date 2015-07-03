/**
 * Created by alex on 03.07.2015.
 *
 */

public class GooseAdapter implements Quackable {

    private Goose goose;
    private Observable observable;

    public GooseAdapter(Goose goose){
        this.goose = goose;
        this.observable = new Observable(this);
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public void quack() {
        goose.honk();
        notifyObservers();
    }

    public String toString() {
        return goose.toString().concat(" with GooseAdapter");
    }
}
