package javaLevel1.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Plate: " + food);
    }

    public boolean decreaseFood(int n) {
        if((food - n) < 0) {
            System.out.println("Food is not enough :(");
            return false;
        }
        else {
            food -= n;
            return true;
        }
    }

    public void encreaseFood(int addFood) {
        food += addFood;
    }
}

