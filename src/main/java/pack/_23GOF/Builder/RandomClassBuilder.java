package pack._23GOF.Builder;

public class RandomClassBuilder {
    private String firstAttribute;
    private String secondAttribute;

    public RandomClassBuilder() {
    }

    public RandomClassBuilder firstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
        return this;
    }

    public RandomClassBuilder secondAttribute(String secondAttribute) {
        this.secondAttribute = secondAttribute;
        return this;
    }

    public String getFirstAttribute() {
        return firstAttribute;
    }

    public String getSecondAttribute() {
        return secondAttribute;
    }

    public RandomClass build() {
        return new RandomClass(this);
    }
}
