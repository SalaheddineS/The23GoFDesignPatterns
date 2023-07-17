package pack._23GOF.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeBox implements Box{
    List<Box> boxes = new ArrayList<>();

    @Override
    public double countKgs() {
        double sum=0;
        for(Box x:boxes){
            sum+=x.countKgs();
        }
        System.out.println("The Sum of the weight is: " +sum);
        return sum;
    }
}
