package pack._23GOF.Singleton;

public class RandomClass {
    private RandomClass() {}
    // Eagar initialization
    private static final RandomClass instance = new RandomClass();
    public static RandomClass getInstance() {
        System.out.println("Eagar initialization");
        return instance;
    }

    // static block initialization
    private static RandomClass instance2;
    static {
        try {
            instance2 = new RandomClass();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static RandomClass getInstance2() {
        System.out.println("static block initialization");
        return instance2;
    }

}
