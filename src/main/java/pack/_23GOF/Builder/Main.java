package pack._23GOF.Builder;

public class Main {

public static void main(String args[])
    {
        RandomClass rc = new RandomClassBuilder()
                .firstAttribute("first")
                .secondAttribute("second")
                .build();
        rc.print();
    }
}
