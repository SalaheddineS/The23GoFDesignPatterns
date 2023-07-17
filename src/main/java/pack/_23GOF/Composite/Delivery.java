package pack._23GOF.Composite;

public class Delivery {
    private Box box;

    public Delivery(Box box){
        this.box=box;
    }

    public void countEverything(){
        box.countKgs();
    }
}
