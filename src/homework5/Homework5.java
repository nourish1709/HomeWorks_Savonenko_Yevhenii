package homework5;

public class Homework5 {
    public static void main(String[] args) {
        MyList<Double> doubleList = new MyList<>();
        MyList<String> stringList = new MyList<>();

        doubleList.add(25.64);
        doubleList.add(782.12);
        doubleList.add(-48.51);
        doubleList.add(585D);
        doubleList.add(-454.5761);
        doubleList.add(861.123);
        doubleList.add(-3.7E2);

        stringList.add("Lose");
        stringList.add("Yourself");
        stringList.add("to");
        stringList.add("Dance");

        System.out.println(doubleList);
        System.out.println(stringList);

        System.out.println("The largest element of the arrayList is: " + doubleList.getLargest());
        System.out.println("The smallest element of the arrayList is: " + doubleList.getSmallest());

        System.out.println("The largest element of the arrayList is: " + stringList.getLargest());
        System.out.println("The smallest element of the arrayList is: " + stringList.getSmallest());
    }
}
