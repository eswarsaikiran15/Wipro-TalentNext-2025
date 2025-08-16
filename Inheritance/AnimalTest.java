class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird pecks at food");
    }

    @Override
    void sleep() {
        System.out.println("Bird sleeps perched on a branch");
    }

    void fly() {
        System.out.println("Bird flies high in the sky");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}