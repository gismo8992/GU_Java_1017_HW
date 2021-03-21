package javaLevel2.lesson1.Participant;

public class Team {
    private String teamName;
    Participant[] teamMembers = new Participant[4];

    public Team(String teamName, Participant... teamMembers) {
        this.teamName = teamName;
        for (Participant participant : teamMembers);
    }

    public Participant[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        System.out.println("Each participants result on all the distance: ");
        for(Participant member: teamMembers){
            member.showResult();
        }
    }

    public void isPassedTheDistance(){
        System.out.println("Participants who passed all the distance: ");
        for(Participant member: teamMembers){
            if(member.isOnDistance()) member.showResult();
        }
    }

}

