package javaLevel2.lesson1.Participant;

public class Human implements Participant, Runnable, Jumpable{
    private final int maxRunDistance;
    private final int maxJumpDistance;
    private boolean onDistance;

    public Human(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.onDistance = true;
    }

    @Override
    public boolean jump(int distance) {
        if(onDistance) {
            System.out.println("Human attempts jump...");
            if(distance <= maxJumpDistance) {
                System.out.println("Human overcame the barrier!");
            }
            else {
                System.out.println("Human doesn't overcome the barrier :(");
                onDistance = false;
            }
        }
        return onDistance;
    }

    @Override
    public boolean run(int distance) {
        if(onDistance) {
            System.out.println("Human attempts run...");
            if(distance <= maxRunDistance) {
                System.out.println("Human overcame the barrier!");
            }
            else {
                System.out.println("Human doesn't overcome the barrier :(");
                onDistance = false;
            }
        }
        return onDistance;
    }

    @Override
    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void showResult() {
        System.out.println("Human is on distance: " + onDistance);
    }

}


