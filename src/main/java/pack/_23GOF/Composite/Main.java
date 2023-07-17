package pack._23GOF.Composite;

public class Main {
    public static void main(String[] args){
        CompositeBox compositeBox=new CompositeBox();
        Manga manga = new Manga( "Manga", 0.5);
        Book book = new Book("Book", 1.5);
        Book book2 = new Book("Book2", 1.5);
        compositeBox.boxes.add(manga);
        compositeBox.boxes.add(book);
        compositeBox.boxes.add(book2);
        Delivery delivery = new Delivery(compositeBox);
        delivery.countEverything();
    }
}
