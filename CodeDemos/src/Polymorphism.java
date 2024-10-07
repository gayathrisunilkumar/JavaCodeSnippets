class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    //@Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    //@Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating objects of different subclasses
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling the overridden method
        animal1.sound(); // Output: Dog barks
        animal2.sound(); // Output: Cat meows
    }
}

