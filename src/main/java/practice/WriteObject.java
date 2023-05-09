package practice;

import java.io.*;

class Dog extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;


    public Dog(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("This is Dog " + name + " speaking.");
    }
}

class Cat extends Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("This is Cat " + name + " speaking!");
    }

}

abstract class Animal {
    public abstract void speak();
}

public class WriteObject {

    public static void main(String[] args) throws Exception {

        File data = new File("C:\\data");
        if (!data.exists()) {
            data.mkdir();
        }

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\data\\Object.ser"));
        Cat catTom = new Cat("Tom");
        Dog dogSnupi = new Dog("Snupi");
        oos.writeObject(dogSnupi);
        oos.writeObject(catTom);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\data\\Object.ser"));
        Animal animal1 = (Animal) ois.readObject();
        animal1.speak();
        Animal animal2 = (Animal) ois.readObject();
        animal2.speak();

        ois.close();

    }
}
