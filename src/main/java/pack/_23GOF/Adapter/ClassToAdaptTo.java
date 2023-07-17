package pack._23GOF.Adapter;

public class ClassToAdaptTo implements RandomInterface2{
    @Override
    public String makeNoise() {
        return "I'm making noise";
    }
}
