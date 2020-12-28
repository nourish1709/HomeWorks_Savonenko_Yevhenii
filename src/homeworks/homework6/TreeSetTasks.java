package homeworks.homework6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTasks {
    public TreeSetTasks() {
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(-489645, -9465, 3548, 9465, -6325, 125674, -45621));

        System.out.println("\n\n");
        task1();
        task2(integers);
        task3(integers, new TreeSet<>(Arrays.asList(9465, -86451, 321684, 489465)));
        task4(integers);
        task5(integers);
        task6(integers);
        task7(integers);
        task8(integers, new TreeSet<>(Arrays.asList(9465, 3548, 125674, -6325)));
        task9(integers);
        task10(integers, -10);
        task11(integers, 9465);
        task12(integers, 9465);
        task13(integers, 9465);
        task14(integers);
        task15(integers);
        task16(integers, 3548);
    }

    private void task1() {
        System.out.println("1. Create a new tree set, add some colors (string) and print out the tree set");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("white");
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("black");
        colors.add("purple");
        colors.add("yellow");
        System.out.println("\tThe tree set: " + colors + "\n");
    }

    private <T> void task2(TreeSet<T> treeSet) {
        System.out.println("2. Iterate through all elements in a tree set");
        System.out.println("The tree set:");
        for (T t : treeSet) {
            System.out.print("\t" + t);
        }
        System.out.println("\n");
    }

    private <T> void task3(TreeSet<T> treeSet1, TreeSet<T> treeSet2) {
        System.out.println("3. Add all the elements of a specified tree set to another tree set");
        System.out.println("\tFirst tree set: " + treeSet1);
        System.out.println("\tSecond tree set: " + treeSet2);
        treeSet2.addAll(treeSet1);
        System.out.println("\tSecond tree set after adding the elements from the first one: " + treeSet2 + "\n");
    }

    private <T> void task4(TreeSet<T> treeSet) {
        System.out.println("4. Create a reverse order view of the elements contained in a given tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        Iterator desc = treeSet.descendingIterator();
        System.out.print("\tThe tree set in reverse view: ");
        while (desc.hasNext()) {
            System.out.print(desc.next() + " ");
        }
        System.out.println("\n");
    }

    private <T> void task5(TreeSet<T> treeSet) {
        System.out.println("5. Get the first and last elements in a tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The first element of a tree set is: " + treeSet.first());
        System.out.println("The last element of a tree set is: " + treeSet.last());
        System.out.println("");
    }

    private <T> void task6(TreeSet<T> treeSet) {
        System.out.println("6. Clone a tree set list to another tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        TreeSet<T> clonedTreeSet = (TreeSet<T>) treeSet.clone();
        System.out.println("\tA cloned tree set: " + clonedTreeSet);
        System.out.println("");
    }

    private <T> void task7(TreeSet<T> treeSet) {
        System.out.println("7. Get the number of elements in a tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The number of elements of the tree set: " + treeSet.size() + "\n");
    }

    private <T> void task8(TreeSet<T> treeSet1, TreeSet<T> treeSet2) {
        System.out.println("8. Compare two tree sets");
        System.out.println("\tFirst tree set: " + treeSet1);
        System.out.println("\tSecond tree set: " + treeSet2);
        TreeSet<T> equals = new TreeSet<>();
        for (T t : treeSet1) {
            if (treeSet2.contains(t)) {
                equals.add(t);
            }
        }
        System.out.println("The number of equal elements is " + equals.size() + ": " + equals + "\n");
    }

    private <T extends Number> void task9(TreeSet<Integer> treeSet) {
        System.out.println("9. Find the numbers less than 7 in a tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        treeSet = (TreeSet) treeSet.headSet(7);
        System.out.println("The numbers less then 7: " + treeSet + "\n");
    }

    private <T> void task10(TreeSet<T> treeSet, T element) {
        System.out.println("10. Get the element in a tree set which is greater than or equal to the given element");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The element in a tree set which is greater then or equal to " + element + " is: " + treeSet.ceiling(element) + "\n");
    }

    private <T> void task11(TreeSet<T> treeSet, T element) {
        System.out.println("11. Get the element in a tree set which is less than or equal to the given element");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The element in a tree set which is less than or equal to " + element + " is: " + treeSet.floor(element) + "\n");
    }

    private <T> void task12(TreeSet<T> treeSet, T element) {
        System.out.println("12. Get the element in a tree set which is strictly greater than the given element");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The element in a tree set which is strictly greater than " + element + " is: " + treeSet.higher(element) + "\n");
    }

    private <T> void task13(TreeSet<T> treeSet, T element) {
        System.out.println("13. Get the element in a tree set which is strictly less than the given element");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The element in a tree set which is less than " + element + " is: " + treeSet.lower(element) + "\n");
    }

    private <T> void task14(TreeSet<T> treeSet) {
        System.out.println("14. Retrieve and remove the first element of a tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The tree set after removing the first element " + treeSet.pollFirst() + ": " + treeSet + "\n");
    }

    private <T> void task15(TreeSet<T> treeSet) {
        System.out.println("15. Retrieve and remove the last element of a tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        System.out.println("The tree set after removing the last element " + treeSet.pollLast() + ": " + treeSet + "\n");
    }

    private <T> void task16(TreeSet<T> treeSet, T element) {
        System.out.println("16. Remove a given element from a tree set");
        System.out.println("\tAn original tree set: " + treeSet);
        if (treeSet.remove(element)) {
            System.out.println("The tree set after removing the element " + element + ": " + treeSet + "\n");
        }
        else {
            System.out.println("There's no element " + element + " in this tree set");
        }
    }
}