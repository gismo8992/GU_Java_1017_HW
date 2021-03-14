package javaLevel2.lesson1.Barrier;

import javaLevel2.lesson1.Participant.Jumpable;
import javaLevel2.lesson1.Participant.Participant;


public class Wall implements Barrier {
    private final int height;
    private boolean onDistance;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Participant participant) {
        if (participant instanceof Jumpable) {
            return ((Jumpable) participant).jump(height);
        }
        System.out.println("Participant cannot jump.");
        participant.setOnDistance(false);
        return false;
    }
}
