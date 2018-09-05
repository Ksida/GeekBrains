package K3L1.Obstrackes;

import K3L1.animals.Animal;
import K3L1.animals.Participant;

public class Water extends Obstracle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant a) {
        a.swim(distance);

    }


}
