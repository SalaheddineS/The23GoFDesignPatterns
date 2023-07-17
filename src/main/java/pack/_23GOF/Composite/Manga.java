package pack._23GOF.Composite;

public class Manga extends Product{

    public Manga(String name,Double weight){
        this.name=name;
        this.weight=weight;
    }

    @Override
    public double countKgs() {
        return this.weight;
    }
}
