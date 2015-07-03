/**
 * Created by alex on 03.07.2015.
 *
 */

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int quackCounter;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    public void notifyObservers() {
        duck.notifyObservers();
    }

    public static int getQuacks() {
        return quackCounter;
    }

    public void quack() {
        duck.quack();
        quackCounter++;
//        notifyObservers();
    }
}
