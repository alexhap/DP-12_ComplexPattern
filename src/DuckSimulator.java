/**
 * Created by alex on 03.07.2015.
 *
 */

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(duckCall);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    public void simulate(Quackable duck) {
        duck.quack();
    }
}
