package javaLevel2.lesson1.Participant;

public class Cat implements Participant, Jumpable{
    private final int maxJumpDistance;
    private boolean onDistance;


    public Cat(int maxJumpDistance) {
        this.maxJumpDistance = maxJumpDistance;
        this.onDistance = true;
    }

    @Override
    public boolean jump(int distance) {
        if(onDistance) {
            System.out.println("Cat attempts jump...");
            if(distance <= maxJumpDistance) {
                System.out.println("Cat overcame the barrier!");
            }
            else {
                System.out.println("Cat doesn't overcome the barrier :(");
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
        System.out.println("Cat is on distance: " + onDistance);
    }

}
