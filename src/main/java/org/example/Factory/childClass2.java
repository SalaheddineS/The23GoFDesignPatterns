package org.example.Factory;

public class childClass2 extends  randomMotherClass{
    private String attribute1;
    private String attribute2;
    private String attribute3;

    public childClass2(){
        System.out.println("created child class2");
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
