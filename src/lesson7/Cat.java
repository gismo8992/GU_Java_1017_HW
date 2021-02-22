package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public boolean eat(Plate p) {
        p.decreaseFood(appetite);
        if (satiety > 0) {
        }
        else {
            System.out.println("Не хватило еды этому коту (");
            return false;
        }
        return true;
    }


    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

}
