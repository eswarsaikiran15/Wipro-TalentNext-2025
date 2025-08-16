package OverridingOrPolymorphism;

class Fruit {
    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple", "sweet", "medium");
    }

    @Override
    void eat() {
        System.out.println(name + " is juicy and " + taste);
    }
}

class Orange extends Fruit {
    Orange() {
        super("Orange", "sour", "small");
    }

    @Override
    void eat() {
        System.out.println(name + " is tangy and " + taste);
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Fruit genericFruit = new Fruit("Generic Fruit", "neutral", "varied");
        genericFruit.eat();

        Apple apple = new Apple();
        apple.eat();

        Orange orange = new Orange();
        orange.eat();
    }
}