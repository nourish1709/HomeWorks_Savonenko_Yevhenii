package homeworks.homework5;

public class GenericClass<T extends Comparable<T>> {
    private final T[] tArray;

    public GenericClass(T[] tArray){
        this.tArray = tArray;
    }

    public T getHighest(){
        T max = this.tArray[0];
        for (T t : tArray){
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }

    public T getLowest(){
        T min = this.tArray[0];
        for (T t : tArray){
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }

    @Override
    public String toString() {
        System.out.print("Array from generic class: \n\t");
        for(T t : this.tArray) {
            System.out.print(t + " ");
        }
        return "\n";
    }
}
