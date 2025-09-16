// Abstraction
abstract class Animal {
    private String name; // Encapsulation (private field)

    public Animal(String name) {
        this.name = name;
    }

    // Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void sound();

    // Normal method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Inheritance: Dog inherits from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Polymorphism: method overriding
    @Override
    public void sound() {
        System.out.println(getName() + " says Woof! Woof!");
    }
}

// Another subclass
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says Meow!");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        // Polymorphism: Animal reference, Dog object
        Animal myDog = new Dog("Bruno");
        Animal myCat = new Cat("Kitty");

        myDog.eat();
        myDog.sound();  // Calls Dog's version

        myCat.eat();
        myCat.sound();  // Calls Cat's version
    }
}
