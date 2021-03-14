package javaLevel2.lesson1.Participant;

public class Robot implements Participant, Runnable, Jumpable{
    private final int maxRunDistance;
    private final int maxJumpDistance;
    private boolean onDistance;

    public Robot(int maxRunDistance, int maxJumpDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        this.onDistance = true;
    }

    @Override
    public boolean jump(int distance) {
        if(onDistance) {
            System.out.println("Robot attempts jump...");
            if(distance <= maxJumpDistance) {
                System.out.println("Robot overcame the barrier!");
            }
            else {
                System.out.println("Robot doesn't overcome the barrier :(");
                onDistance = false;
            }
        }
        return onDistance;
    }

    @Override
    public boolean run(int distance) {
        if(onDistance) {
            System.out.println("Robot attempts run...");
            if(distance <= maxRunDistance) {
                System.out.println("Robot overcame the barrier!");
            }
            else {
                System.out.println("Robot doesn't overcome the barrier :(");
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
        System.out.println("Robot is on distance: " + onDistance);
    }

    public boolean getOnDistance() {
        return onDistance;
    }
}
