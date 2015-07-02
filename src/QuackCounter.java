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

    public static int getQuacks() {
        return quackCounter;
    }

    public void quack() {
        duck.quack();
        quackCounter++;
    }
}
