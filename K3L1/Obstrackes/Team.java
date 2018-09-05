package K3L1.Obstrackes;

import K3L1.animals.Participant;

public class Team {

    private String title;
    private Participant []participants;

    public Team(String title, Participant... participants) {

        this.title = title;
        this.participants = participants;
    }

    public Participant[] getMembers() {

        return participants;
    }

    public void showResults(){
        for(Participant p: participants){
            if(p.isOnDistance()){
                p.info();
            }
        }
    }
}
