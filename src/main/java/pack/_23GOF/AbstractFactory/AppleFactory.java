package pack._23GOF.AbstractFactory;

public class AppleFactory implements PhoneFactory{

    @Override
    public Product CreateProduct(String productType) {
        if(productType.equals("Phone")){
            return new ApplePhone();
        }
        else if(productType.equals("Battery")){
            return new AppleBattery();
        }
        return null;
    }
}
