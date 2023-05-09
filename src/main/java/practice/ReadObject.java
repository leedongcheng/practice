package practice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\data\\Object.ser"));

//        Animal dog = (Dog) ois.readObject();
//        dog.speak();
////        Animal cat = (Cat) ois.readObject();
////        cat.speak();
//        ois.close();
        Dog dog1 = (Dog)ois.readObject();
        dog1.speak();
        Cat cat1 = (Cat)ois.readObject();
        cat1.speak();
    }
}
