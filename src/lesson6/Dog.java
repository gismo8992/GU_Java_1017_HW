package lesson6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name, 500, 10);
    }


    public void running(int distance) {
        if (distance <= getRunMaxDistance()) {
            System.out.println(getName() + " пробежал " + distance + "м.");
        } else {
            System.out.println(getName() + " может пробежать только " + getRunMaxDistance() + "м. Снизте дистанцию.");
        }
    }

    @Override
    public void swimming(int distance) {
        if (distance <= getSwimMaxDistance()) {
            System.out.println(getName() + " проплыл " + distance + "м.");
        } else {
            System.out.println(getName() + " может проплыть только " + getSwimMaxDistance() + "м. Снизте дистанцию.");
        }
    }
}
