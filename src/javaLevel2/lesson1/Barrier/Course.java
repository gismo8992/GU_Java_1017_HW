package javaLevel2.lesson1.Barrier;

import javaLevel2.lesson1.Participant.Participant;
import javaLevel2.lesson1.Participant.Team;

public class Course {

    private Barrier[] barriers;

    public Course(Barrier[] barriers){
        this.barriers = barriers;
    }

    public void doIt(Team team){
        Participant[] teamMembers = team.getMembers();
        if(teamMembers.length > 0){
            for (Participant member: teamMembers){
                for (Barrier barrier: barriers){
                    barrier.doIt(member);
                    if (!member.isOnDistance()) break;
                }
            }
        } else {
            System.out.println("There are no members in the team!");
        }
    }
}
