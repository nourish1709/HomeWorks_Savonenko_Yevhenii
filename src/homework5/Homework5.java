package homework5;

public class Homework5 {
    public static void main(String[] args) {

        // First task
        MyList<Float> floatList = new MyList<>();
        floatList.add(645.45f);
        floatList.add(-45.12f);
        floatList.add(-0.245E2f);
        floatList.add(0.453E3f);
        floatList.add(48563.4512f);
        floatList.add(-45.1596f);
        System.out.println(floatList);
        System.out.println("The largest element of the arrayList numbers of type float is: " + floatList.getLargest());
        System.out.println("The smallest element of the arrayList numbers of type float numbers is: " + floatList.getSmallest());
        System.out.println();

        // Second task
        MyListModified<Double> doubleList = new MyListModified<>();
        MyListModified<String> stringList = new MyListModified<>();

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
        System.out.println("The largest element of the arrayList with numbers is: " + doubleList.getLargest());
        System.out.println("The smallest element of the arrayList with numbers is: " + doubleList.getSmallest());
        System.out.println();

        System.out.println(stringList);
        System.out.println("The largest element of the arrayList with strings is: " + stringList.getLargest());
        System.out.println("The smallest element of the arrayList with strings is: " + stringList.getSmallest());
        System.out.println();

        // Third task
        Float[] doubles = new Float[]{4.4535f, -456.12f, 6.085E2f, 84.12378f, 32.141f, -753.2153f};
        String[] strings = new String[]{"Random", "Access", "Memories -", "Daft", "Punk"};

        GenericClass<Float> floatGenericClass = new GenericClass<>(doubles);
        GenericClass<String> stringGenericClass = new GenericClass<>(strings);

        System.out.println(floatGenericClass);
        System.out.println("The highest element of the array with is: " + floatGenericClass.getHighest());
        System.out.println("The lowest element of the array is: " + floatGenericClass.getLowest());
        System.out.println();

        System.out.println(stringGenericClass);
        System.out.println("The highest element of the array with is: " + stringGenericClass.getHighest());
        System.out.println("The lowest element of the array is: " + stringGenericClass.getLowest());
    }
}
