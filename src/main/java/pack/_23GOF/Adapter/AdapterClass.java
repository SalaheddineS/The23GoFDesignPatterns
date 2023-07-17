package pack._23GOF.Adapter;

public class AdapterClass implements RandomInterface2{
    RandomClass randomClass;

    public AdapterClass(RandomClass randomClass) {
        this.randomClass = randomClass;
    }

    @Override
    public String makeNoise() {
        return randomClass.makeSound();
    }
}
