package pack._23GOF.Builder;

public class RandomClass {
    private String firstAttribute;
    private String secondAttribute;

    public RandomClass(RandomClassBuilder builder) {
        this.firstAttribute = builder.getFirstAttribute();
        this.secondAttribute = builder.getSecondAttribute();
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

}
