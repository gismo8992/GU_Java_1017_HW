package javaLevel1.lesson7;

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
        satiety = p.decreaseFood(appetite);
        if (satiety) {
            System.out.println(name + " ate.");
        }
    }

    public void satietyCatInfo() {
        System.out.println("Satiety " + name + ": " + getSatiety());
    }

    public boolean getSatiety() {
        return satiety;
    }
}
