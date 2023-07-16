package org.example.AbstractFactory;

public class NokiaFactory implements PhoneFactory{

    @Override
    public Product CreateProduct(String productType) {
        if(productType.equals("Phone")){
            return new NokiaPhone();
        }
        else if(productType.equals("Battery")){
            return new NokiaBattery();
        }
        return null;
    }
}
