package K3L1.Obstrackes;

import K3L1.animals.Participant;

public class Cross extends Obstracle {
    private int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }


    @Override
    public void doIt(Participant a) {
        a.run(lenght);
    }
}
