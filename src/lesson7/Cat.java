package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.println(name + " ate.");
            satiety = true;
        }
    }

    public void satietyCatInfo() {
        System.out.println("Satiety " + name + ": " + getSatiety());
    }

    public boolean getSatiety() {
        return satiety;
    }
}
