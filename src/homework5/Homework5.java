package homework5;

public class Homework5 {
    public static void main(String[] args) {
        MyList<Double> myList = new MyList<>();

        myList.add(25.64);
        myList.add(782.12);
        myList.add(-48.51);
        myList.add(585D);
        myList.add(-454.454);
        myList.add(861.123);
        myList.add(-3.7E2);

        System.out.println(myList);

        System.out.println("The largest element of the arrayList is: " + myList.getLargest());
        System.out.println("The smallest element of the arrayList is: " + myList.getSmallest());
    }
}
