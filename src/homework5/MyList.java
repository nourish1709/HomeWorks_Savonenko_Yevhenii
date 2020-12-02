package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number> {
    protected final List<T> tArrayList = new ArrayList<>();

    public void add(T t){
        this.tArrayList.add(t);
    }

    public List<T> getArrayList(){
        return tArrayList;
    }

    public T getLargest(){
        return Collections.max(tArrayList, new NumbersComparator());
    }

    public T getSmallest(){
        return Collections.min(tArrayList, new NumbersComparator());
    }

    @Override
    public String toString() {
        System.out.print("ArrayList from generic class: \n\t");
        for(T t : this.tArrayList) {
            System.out.print(t + " ");
        }
        return "\n";
    }
}