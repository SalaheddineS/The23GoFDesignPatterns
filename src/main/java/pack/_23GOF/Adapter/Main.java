package pack._23GOF.Adapter;

public class Main {
    public static void main(String[] args){
        RandomClass randomClass=new RandomClass();
        ClassToAdaptTo classToAdaptTo = new ClassToAdaptTo();

        System.out.println("testing Random Class");
        System.out.println(randomClass.fly());
        System.out.println(randomClass.makeSound());

        System.out.println("testing class to adapt to");
        System.out.println(classToAdaptTo.makeNoise());

        System.out.println("adapting random class to class to adapt to");
        RandomInterface2 adapterClass = new AdapterClass(randomClass);
        System.out.println(adapterClass.makeNoise());
    }
}
