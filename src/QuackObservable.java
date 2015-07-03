/**
 * Created by alex on 03.07.2015.
 *
 */

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
