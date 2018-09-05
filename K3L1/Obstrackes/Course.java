package K3L1.Obstrackes;

import K3L1.animals.Participant;

public class Course {

    private Obstracle []obstracles;

    public Course(Obstracle []obstracles) {

        this.obstracles = obstracles;
    }

    public void doIt(Team team){
        for(Participant p: team.getMembers()){
            for(Obstracle o: obstracles){
                o.doIt(p);
                if(!p.isOnDistance()){
                    break;
                }
            }
        }
    }
}
