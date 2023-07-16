package org.example.Factory;

public class factoryClass {
    public static randomMotherClass create(String type) {
        if (type.equals("childClass1")) {
            return new childClass1();
        } else if (type.equals("childClass2")) {
            return new childClass2();
        } else {
            throw new RuntimeException("Theres no class with the name you entered");
        }
    }
}
