/**
 * Created by alex on 03.07.2015.
 *
 */

public class DuckFactory extends AbstractDuckFactory {

    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    public Quackable createRedheadDuck() {
        return new RedHeadDuck();
    }

    public Quackable createDuckCall() {
        return new DuckCall();
    }

    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
