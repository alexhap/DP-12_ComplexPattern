/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.Observable;

public class QuackCounter extends Observable implements Quackable {

    private Quackable duck;
    private static int quackCounter;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public static int getQuacks() {
        return quackCounter;
    }

    public void quack() {
        duck.quack();
        quackCounter++;
    }

    public String toString() {
        return duck.toString();
    }
}
