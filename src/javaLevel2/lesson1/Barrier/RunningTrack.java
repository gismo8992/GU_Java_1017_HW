package javaLevel2.lesson1.Barrier;

import javaLevel2.lesson1.Participant.Participant;
import javaLevel2.lesson1.Participant.Runnable;

public class RunningTrack implements Barrier{
    private final int width;

    public RunningTrack(int width) {
        this.width = width;
    }

    @Override
    public boolean doIt(Participant participant) {
        if (participant instanceof Runnable) {
            return ((Runnable) participant).run(width);
        }
        System.out.println("Participant cannot run.");
        participant.setOnDistance(false);
        return false;
    }
}
