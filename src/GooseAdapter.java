/**
 * Created by alex on 03.07.2015.
 *
 */

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }
}
