package org.example.Prototype;

public class Main {

    public static void  main(String[] args) throws CloneNotSupportedException {
        RandomClass rc = new RandomClass("first", "second");
        RandomClass rc2 = (RandomClass) rc.clone();
        rc2.print();
    }
}
