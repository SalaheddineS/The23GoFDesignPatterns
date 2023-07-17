package pack._23GOF.Factory;

public class FactoryClass {
    public static RandomMotherClass create(String type) {
        if (type.equals("ChildClass1")) {
            return new ChildClass1();
        } else if (type.equals("ChildClass2")) {
            return new ChildClass2();
        } else {
            throw new RuntimeException("Theres no class with the name you entered");
        }
    }
}
