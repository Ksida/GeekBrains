package K3L1.Obstrackes;

import K3L1.animals.Participant;

public class Wall extends Obstracle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public void doIt(Participant a) {
        a.jump(height);
    }
}
