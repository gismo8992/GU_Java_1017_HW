package javaLevel2.lesson1;

import javaLevel2.lesson1.Barrier.Barrier;
import javaLevel2.lesson1.Barrier.Course;
import javaLevel2.lesson1.Barrier.RunningTrack;
import javaLevel2.lesson1.Barrier.Wall;
import javaLevel2.lesson1.Participant.Cat;
import javaLevel2.lesson1.Participant.Human;
import javaLevel2.lesson1.Participant.Robot;
import javaLevel2.lesson1.Participant.Team;

public class Main {

    public static void main (String[] args) {

        Team team1 = new Team("dreamTeam", new Human(500, 2), new Cat(5), new Robot(1000, 10));
        System.out.println("Team is created!");

        Barrier[] barriers1 = {new RunningTrack(520), new Wall(4)};
        Course course1 = new Course(barriers1);
        course1.doIt(team1);
        team1.showResults();
        team1.isPassedTheDistance();

    }
}
