package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        food -= n;
        if(food < 0) {
            System.out.println("Plate is empty :(");
            food = 0;
        }
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

}

