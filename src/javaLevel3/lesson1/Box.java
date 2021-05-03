package javaLevel3.lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> implements Comparable<Box<? extends Fruit>> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public float getWeight() {
        if(fruits.isEmpty()) {
            return 0.0f;
        }
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compare(Box<? extends Fruit> that) {
        return getWeight() == that.getWeight();
    }

    @Override
    public int compareTo(Box<? extends Fruit> that) {
        return Float.compare(getWeight(), that.getWeight());
    }

    public void toTransfer(Box<T> that) {
        fruits.addAll(that.getFruits());
        that.getFruits().clear();
    }

    private ArrayList<T> getFruits() {
        return fruits;
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }
}
