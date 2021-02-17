package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Barsik");
        cat1.running(150);
        cat2.running(210);
        cat1.swimming(10);
        Dog dog1 = new Dog("Tuzik");
        dog1.running(500);
        dog1.swimming(10);
    }
}
