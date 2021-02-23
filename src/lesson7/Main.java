package lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate1 = new Plate(30);
        satietyInfo(catEating(catsArray(), plate1));
        plate1.encreaseFood(100);
        plate1.info();
        }

    public static Cat[] catEating(Cat[] catsArray, Plate plate1) {
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].eat(plate1);
            plate1.info();
        }
        return catsArray;
    }

    public static void satietyInfo(Cat[] catsArray) {
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].satietyCatInfo();
        }
    }

    public static Cat[] catsArray() {
        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat("Murzik", 7, 0);
        catsArray[1] = new Cat("Barsik", 10, 0);
        catsArray[2] = new Cat("Tom", 8, 0);
        catsArray[3] = new Cat("Krepish", 15, 0);
        return catsArray;
    }
}
