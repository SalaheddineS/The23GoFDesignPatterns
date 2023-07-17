package pack._23GOF.Adapter;

public class RandomClass implements RandomInterface1 {
    @Override
    public String fly() {
        return "I'm flying";
    }

    @Override
    public String makeSound() {
        return "I'm making sound";
    }
}
