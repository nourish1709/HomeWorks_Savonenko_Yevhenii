package homeworks.homework6;

import java.util.*;

public class HashSetTasks {
    public HashSetTasks() {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(-4865);
        integers.add(9456);
        integers.add(6354);
        integers.add(321896);
        integers.add(-989516);
        HashSet<String> strings = new HashSet<>();
        strings.add("table");
        strings.add("mouse");
        strings.add("laptop");
        strings.add("green");
        strings.add("photo");
        strings.add("monitor");

        System.out.println("\n\n");
        task1(integers, 9651);
        task2(integers);
        task3(integers);
        task4(integers);
        task5(strings);
        task6(strings);
        task7(strings);
        task8(strings);
        task9(strings);
        task10(strings, new HashSet<>(Arrays.asList("laptop", "green")));
        task11(strings, new HashSet<>(Arrays.asList("mouse", "photo", "laptop", "before", "airpods")));
        task12(strings);
    }

    private <T> void task1(HashSet<T> hashSet, T element) {
        System.out.println("1. Append the specified element to the end of a hash set");
        System.out.println("\tThe original hash set: " + hashSet);
        hashSet.add(element);
        System.out.print("The hash set with appended element: " + hashSet);
        System.out.println("\n");
    }

    private <T> void task2(HashSet<T> hashSet) {
        System.out.println("2. Iterate through all elements in a hash list");
        System.out.print("The hash set:\n\t");
        for (T t : hashSet) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task3(HashSet<T> hashSet) {
        System.out.println("3. Get the number of elements in a hash set");
        System.out.println("\tThe original hash set: " + hashSet);
        System.out.print("The number of elements is " + hashSet.size());
        System.out.println("\n");
    }

    private <T> void task4(HashSet<T> hashSet) {
        System.out.println("4. Empty an hash set");
        System.out.println("\tThe original hash set: " + hashSet);
        hashSet.removeAll(hashSet);
        System.out.print("The hash set is empty. The number of its elements is " + hashSet.size());
        System.out.println("\n");
    }

    private <T> void task5(HashSet<T> hashSet) {
        System.out.println("5. Test a hash set is empty or not");
        if (hashSet.isEmpty()) {
            System.out.print("The hash set is empty");
        }
        else {
            System.out.print("The hash set is not empty: " + hashSet);
        }
        System.out.println("\n");
    }

    private <T> void task6(HashSet<T> hashSet) {
        System.out.println("6. Clone a hash set to another hash set");
        System.out.println("The original hash set: " + hashSet);
        HashSet<T> clonedHashSet = (HashSet<T>) hashSet.clone();
        System.out.println("The cloned hash set: " + clonedHashSet);
        System.out.println("");
    }

    private <T> void task7(HashSet<T> hashSet) {
        System.out.println("7. Convert a hash set to an array");
        System.out.println("\tThe original hash set: " + hashSet);
        ArrayList<T> arrayList = new ArrayList<>(hashSet);
        System.out.print("\tThe array list: "+ arrayList);
        System.out.println("\n");
    }

    private <T> void task8(HashSet<T> hashSet) {
        System.out.println("8. Convert a hash set to a tree set");
        System.out.println("\tThe original hash set: " + hashSet);
        TreeSet<T> treeSet = new TreeSet<>(hashSet);
        System.out.print("\tThe tree set: " + treeSet);
        System.out.println("\n");
    }

    private <T> void task9(HashSet<T> hashSet) {
        System.out.println("9. Convert a hash set to a List/ArrayList");
        System.out.println("\tThe original hash set: " + hashSet);
        List<T> list = new ArrayList<>(hashSet);
        System.out.print("\tThe new List/Arraylist: " + list);
        System.out.println("\n");
    }

    private <T> void task10(HashSet<T> hashSet1, HashSet<T> hashSet2) {
        System.out.println("10. Compare two hash set");
        System.out.println("\tThe first hash set: " + hashSet1);
        System.out.println("\tThe second hash set: " + hashSet2);
        HashSet<T> equals = new HashSet<>();
        for (T t : hashSet1) {
            if (hashSet2.contains(t)) {
                equals.add(t);
            }
        }
        System.out.println("Values that are in both hash sets: " + equals + "\n");
    }

    private <T> void task11(HashSet<T> hashSet1, HashSet<T> hashSet2) {
        System.out.println("11. Compare two sets and retain elements which are same on both sets");
        System.out.println("\tThe first hash set: " + hashSet1);
        System.out.println("\tThe second hash set: " + hashSet2);
        hashSet1.retainAll(hashSet2);
        System.out.print("\tThe elements that were retained: " + hashSet1);
        System.out.println("\n");
    }

    private <T> void task12(HashSet<T> hashSet) {
        System.out.println("12. Remove all of the elements from a hash set");
        System.out.println("\tThe original hash set: " + hashSet);
        hashSet.removeAll(hashSet);
        System.out.print("\tThe updated hash set has " + hashSet.size() + " elements: " + hashSet);
        System.out.println("\n");
    }
}
