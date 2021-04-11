package javaLevel3.lesson1;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2= new Box<>();

        System.out.println(String.format("Weights of appleBox1: %s", appleBox1.getWeight()));
        System.out.println(String.format("Weights of appleBox2: %s", appleBox2.getWeight()));
        System.out.println(String.format("Weights of orangeBox1: %s", orangeBox1.getWeight()));
        System.out.println(String.format("Weights of orangeBox2: %s", orangeBox2.getWeight()));

        appleBox1.add(apple);
        appleBox2.add(apple);
        appleBox2.add(apple);

        orangeBox1.add(orange);
        orangeBox1.add(orange);
        orangeBox1.add(orange);
        orangeBox2.add(orange);

        System.out.println(String.format("Weights of appleBox1: %s", appleBox1.getWeight()));
        System.out.println(String.format("Weights of appleBox2: %s", appleBox2.getWeight()));
        System.out.println(String.format("Weights of orangeBox1: %s", orangeBox1.getWeight()));
        System.out.println(String.format("Weights of orangeBox2: %s", orangeBox2.getWeight()));

        System.out.println(appleBox1.compare(appleBox2));

        orangeBox2.toTransfer(orangeBox1);

        System.out.println(String.format("Weights of orangeBox1: %s", orangeBox1.getWeight()));
        System.out.println(String.format("Weights of orangeBox2: %s", orangeBox2.getWeight()));
    }
}
