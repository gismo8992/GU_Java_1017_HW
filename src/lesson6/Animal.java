package lesson6;

public abstract class Animal {
    private String name;
    private int runMaxDistance;
    private int swimMaxDistance;

    public Animal(String name, int runMaxDistance, int swimMaxDistance) {
        this.name = name;
        this.swimMaxDistance = swimMaxDistance;
        this.runMaxDistance = runMaxDistance;
    }

    public String getName() {
        return name;
    }

    public int getRunMaxDistance() {
        return runMaxDistance;
    }

    public int getSwimMaxDistance() {
        return swimMaxDistance;
    }

    public abstract void running(int distance);
    public abstract void swimming(int distance);
}
