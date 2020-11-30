package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Comparable<T>>{
    private final List<T> tArrayList = new ArrayList<>();

    public void add(T t){
        this.tArrayList.add(t);
    }

    public List<T> getArrayList(){
        return tArrayList;
    }

    public T getLargest(){
        return Collections.max(tArrayList, new MyListComparator<>());
    }

    public T getSmallest(){
        return Collections.min(tArrayList, new MyListComparator<>());
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
