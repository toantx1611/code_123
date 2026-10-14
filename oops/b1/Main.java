package b1;

class Animal {
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gau gau");
    }
}

class Cat extends Animal {
    public Cat() {
        super();
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Cún"), new Cat("Miu") };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}