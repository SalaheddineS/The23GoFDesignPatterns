package org.example.Singleton;

public class randomClass {
    private randomClass() {}
    // Eagar initialization
    private static final randomClass instance = new randomClass();
    public static randomClass getInstance() {
        System.out.println("Eagar initialization");
        return instance;
    }

    // static block initialization
    private static randomClass instance2;
    static {
        try {
            instance2 = new randomClass();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static randomClass getInstance2() {
        System.out.println("static block initialization");
        return instance2;
    }

}
