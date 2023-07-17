package pack._23GOF.Composite;

public class Book extends Product{
    private String author;

    public Book(String name,double weight){
        this.name=name;
        this.weight=weight;
        this.author="randomAuthor";
    }
    @Override
    public double countKgs() {
        return this.weight;
    }
}
