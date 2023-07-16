package org.example.AbstractFactory;

public class Main {
    public static void main(String args[])
    {
        PhoneFactory factory = new AppleFactory();
        Product product = factory.CreateProduct("Phone");
        product.Show();

        factory = new NokiaFactory();
        product = factory.CreateProduct("Battery");
        product.Show();
    }
}
