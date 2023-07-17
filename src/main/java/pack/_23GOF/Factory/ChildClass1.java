package pack._23GOF.Factory;

public class ChildClass1 extends RandomMotherClass {
    private String attribute1;
    private String attribute2;
    private String attribute3;

    public ChildClass1(){
        System.out.println("created child class1");
    }
    @Override
    public String getAttribute1() {
        return attribute1;
    }

    @Override
    public String getAttribute2() {
        return attribute2;
    }

    @Override
    public String getAttribute3() {
        return attribute3;
    }
}
