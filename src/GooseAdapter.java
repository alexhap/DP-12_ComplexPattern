/**
 * Created by alex on 03.07.2015.
 *
 */

import java.util.Observable;

public class GooseAdapter extends Observable implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }

    public String toString() {
        return goose.toString().concat(" with GooseAdapter");
    }
}
