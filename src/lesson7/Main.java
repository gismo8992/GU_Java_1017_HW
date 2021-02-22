package lesson7;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 15, 0);
        Cat cat2 = new Cat("Murzik", 10, 0);
        Plate plate1 = new Plate(20);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
        catsArray();
        }

    public static Cat[] catsArray() {
        Cat[] catsArray = new Cat[2];
        catsArray[0] = new Cat("Tom", 7, 0);
        catsArray[1] = new Cat("Matroskin", 10, 0);
        return catsArray;
    }
}
