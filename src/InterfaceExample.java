interface Animal {
    void sound();
    void sleep();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}
