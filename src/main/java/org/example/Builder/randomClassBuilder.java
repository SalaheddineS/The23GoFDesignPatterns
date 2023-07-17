package org.example.Builder;

public class randomClassBuilder {
    private String firstAttribute;
    private String secondAttribute;

    public randomClassBuilder() {
    }

    public randomClassBuilder firstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
        return this;
    }

    public randomClassBuilder secondAttribute(String secondAttribute) {
        this.secondAttribute = secondAttribute;
        return this;
    }

    public String getFirstAttribute() {
        return firstAttribute;
    }

    public String getSecondAttribute() {
        return secondAttribute;
    }

    public randomClass build() {
        return new randomClass(this);
    }
}
