package lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, 200, 0);
    }

    @Override
    public void running(int distance) {
        if (distance <= getRunMaxDistance()) {
            System.out.println(getName() + " пробежал " + distance + "м.");
        } else {
            System.out.println(getName() + " может пробежать только " + getRunMaxDistance() + "м. Снизте дистанцию.");
        }
    }

    @Override
    public void swimming(int distance) {
        System.out.println(getName() + " не может плавать.");
    }
}
