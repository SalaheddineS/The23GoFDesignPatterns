package org.example.Factory;

public abstract class randomMotherClass {
    public abstract String getAttribute1();
    public abstract String getAttribute2();
    public abstract String getAttribute3();

    @Override
    public String toString() {
        return "Attribute1: " + getAttribute1() + "\nAttribute2: " + getAttribute2() + "\nAttribute3: " + getAttribute3();
    }
}
