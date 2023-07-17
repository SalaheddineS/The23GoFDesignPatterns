package pack._23GOF.Prototype;

public class RandomClass implements Cloneable {
    private String firstAttribute;
    private String secondAttribute;

    public RandomClass() {
    }

    public RandomClass(String firstAttribute, String secondAttribute) {
        this.firstAttribute = firstAttribute;
        this.secondAttribute = secondAttribute;
    }

    public String getFirstAttribute() {
        return firstAttribute;
    }

    public void setFirstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
    }

    public String getSecondAttribute() {
        return secondAttribute;
    }

    public void setSecondAttribute(String secondAttribute) {
        this.secondAttribute = secondAttribute;
    }

    public void print() {
        System.out.println("firstAttribute: " + firstAttribute + " secondAttribute: " + secondAttribute);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
