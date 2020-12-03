package homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTasks {

    public ArrayListTasks() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(-456);
        integers.add(545);
        integers.add(-863);
        integers.add(64680);
        integers.add(-78964);
        ArrayList<Long> longs = new ArrayList<>();
        longs.add(-4564L);
        longs.add(498456L);
        longs.add(-123841L);
        longs.add(64896L);
        longs.add(-78645L);
        longs.add(134598L);
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(-654564.64513D);
        doubles.add(4561.8651865);
        doubles.add(-0.8741523E5);
        doubles.add(123874513.24);
        doubles.add(-986453.2154);
        doubles.add(23685.254);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("word");
        strings.add("balance");
        strings.add("nike");
        strings.add("vetements");
        strings.add("social");
        strings.add("Asus");
        strings.add("condition");

        task1();
        task2(integers);
        task3(longs, 784658L);
        task4(2, integers);
        task5(strings, "social", "club");
        task6(strings);
        task7(integers, -545);
        task8(integers);
        task9(new ArrayList<String>(Arrays.asList("iuheafn", "hnadsk", "iuwfhenk2903ji", "23hfoiwln", "8q64wca", "8923hfnkcsa", "ji9wfujo", "9wpjojadojp")), strings);
        task10(longs);
        task11(longs);
        task12(integers, 2, 5);
        task13(strings, strings);
        task14(longs, 0, 4, -746L, 1564856L);
        task15(integers, new ArrayList<Integer>(Arrays.asList(-456, 541, -8465654, 12685, 6515)));
        task16(doubles);
        task17(strings, new ArrayList<String>(Arrays.asList("nike", "condition", "vetements")));
        task18(new ArrayList<>());
        task19(new ArrayList<String>(Arrays.asList("iuheafn", "hnadsk", "iuwfhenk2903ji")));
        task20(strings);
        task21(longs, 946512346L);
        task22(integers, 3);
    }

    private void task1(){
        System.out.println("1. Create a new array list, add some colors (string) and print out the collection");
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("black");
        colors.add("yellow");
        colors.add("brown");
        colors.add("red");
        colors.add("green");
        colors.add("orange");
        colors.add("pink");
        System.out.print("\t");
        System.out.println(colors);
        System.out.println();
    }

    private <T> void task2(ArrayList<T> arrayList){
        System.out.print("2. Iterate through all elements in an array list\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println();
    }

    private <T extends Number> void task3(ArrayList<T> arrayList, T newValue) {
        System.out.println("3. Insert an element into the array list at the first position");
        System.out.print("Before inserting:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        arrayList.set(0, newValue);
        System.out.print("\nAfter inserting at the first position: \n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println();
    }

    private <T> void task4(int index, ArrayList<T> arrayList) {
        System.out.println("4. Retrieve an element (at a specified index) from a given array list");
        System.out.print("A given array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\nThe element at the position " + index + ": " + arrayList.get(index));
        System.out.println();
    }

    private <T> void task5(ArrayList<T> arrayList, T element, T newElement) {
        System.out.println("5. Update specific array element by given element");
        if (!arrayList.contains(element)) {
            System.out.println("There's no such object in a given array list");
        }
        else {
            System.out.print("A given array list:\n\t");
            for (T t : arrayList) {
                System.out.print(t + " ");
            }
            arrayList.set(arrayList.indexOf(element), newElement);
            System.out.print("\nAn array list after updating:\n\t");
            for (T t : arrayList) {
                System.out.print(t + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private <T> void task6(ArrayList<T> arrayList) {
        System.out.println("6. Remove the third element from an array list");
        System.out.print("An array list before removing:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        arrayList.remove(2);
        System.out.print("\nAn array list after removing:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println();
    }

    private <T> void task7(ArrayList<T> arrayList, T element) {
        System.out.println("7. Search an element in an array list");
        if (arrayList.contains(element)) {
            System.out.print("The object " + element + " was found in the next array list in the position: " + arrayList.indexOf(element) + "\n\t");
            for (T t : arrayList) {
                System.out.print(t + " ");
            }
        }
        else {
            System.out.print("The object " + element + " was not found in the next array list:\n\t");
            for (T t : arrayList) {
                System.out.print(t + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    private <T extends Comparable<T>> void task8(ArrayList<T> arrayList) {
        System.out.println("8. Sort a given array list");
        System.out.print("An array list before sorting:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        Collections.sort(arrayList);
        System.out.print("\nAn array list after sorting:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println();
    }

    private <T> void task9(ArrayList<T> dest, ArrayList<T> src) {
        System.out.println("9. Copy one array list into another");
        System.out.print("A source array list:\n\t");
        for (T t : src) {
            System.out.print(t + " ");
        }
        System.out.print("\nA destination array list before copying:\n\t");
        for (T t : dest) {
            System.out.print(t + " ");
        }
        Collections.copy(dest, src);
        System.out.print("\nA destination array list after copying:\n\t");
        for (T t : dest) {
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.println();
    }

    private <T> void task10(ArrayList<T> arrayList) {
        System.out.println("10. Shuffle elements in an array list");
        System.out.print("An array list before shuffling:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        Collections.shuffle(arrayList);
        System.out.print("\nAn array list after shuffling:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task11(ArrayList<T> arrayList) {
        System.out.println("11. Reverse elements in an array list");
        System.out.print("An original array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        Collections.reverse(arrayList);
        System.out.print("\nA result array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task12(ArrayList<T> arrayList, int start, int end) {
        System.out.println("12. Extract a portion of an array list");
        System.out.print("An original array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        List<T> subList = arrayList.subList(start, end);
        System.out.print("\nA sublist from index " + start + " to index " + (end - 1) + ":\n\t");
        for (T t : subList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task13(ArrayList<T> arrayList1, ArrayList<T> arrayList2) {
        System.out.println("13. Compare two array lists");
        System.out.print("First array list:\n\t");
        for (T t : arrayList1) {
            System.out.print(t + " ");
        }
        System.out.print("\nSecond array list:\n\t");
        for (T t : arrayList2) {
            System.out.print(t + " ");
        }
        if (arrayList1.equals(arrayList2)) {
            System.out.println("\nThe array lists are completely equal");
        }
        else {
            System.out.println("\nThe array lists are not equal");
        }
        System.out.println("");
    }

    private <T> void task14(ArrayList<T> arrayList, int first, int second, T value1, T value2) {
        System.out.println("14. Swap two elements in an array list");
        System.out.print("An original array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        arrayList.set(first, value1);
        arrayList.set(second, value2);
        System.out.print("\nSwap the element " + first + " with " + value1 + " and the element " + second + " with " + value2 + ". The result array list after swapping:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task15(ArrayList<T> arrayList1, ArrayList<T> arrayList2) {
        System.out.println("15. Join two array lists");
        System.out.print("First array list:\n\t");
        for (T t : arrayList1) {
            System.out.print(t + " ");
        }
        System.out.print("\nSecond array list:\n\t");
        for (T t : arrayList2) {
            System.out.print(t + " ");
        }
        arrayList1.addAll(arrayList2);
        System.out.print("\nThe merged array list:\n\t");
        for (T t : arrayList1) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task16(ArrayList<T> arrayList1) {
        System.out.println("16. Clone an array list to another array list");
        System.out.print("First array list:\n\t");
        for (T t : arrayList1) {
            System.out.print(t + " ");
        }
        ArrayList<T> arrayList2 = (ArrayList) arrayList1.clone();
        System.out.print("\nThe copy of the original array list:\n\t");
        for (T t : arrayList2) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task17(ArrayList<T> arrayList1, ArrayList<T> arrayList2) {
        System.out.println("17. Empty an array list");
        System.out.print("An original array list:\n\t");
        for (T t : arrayList1) {
            System.out.print(t + " ");
        }
        System.out.print("\nCollection of elements to be removed\n\t");
        for (T t : arrayList2) {
            System.out.print(t + " ");
        }
        arrayList1.removeAll(arrayList2);
        System.out.print("\nThe first array list after removing:\n\t");
        for (T t : arrayList1) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task18(ArrayList<T> arrayList) {
        System.out.println("18. Test an array list is empty or not");
        if (arrayList.isEmpty()) {
            System.out.print("\tThe original array list is empty");
        }
        else {
            System.out.print("\tThe original array list isn't empty:\n\t");
            for (T t : arrayList) {
                System.out.print(t + " ");
            }
        }
        System.out.println("\n");
    }

    private <T> void task19(ArrayList<T> arrayList) {
        System.out.println("19. Trim the capacity of an array list the current list size");
        arrayList.trimToSize();
        System.out.print("The trimmed array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task20(ArrayList<T> arrayList) {
        System.out.println("20. Increase the size of an array list");
        System.out.print("The original array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        arrayList.ensureCapacity(arrayList.size() + 1);
        arrayList.add((T) "coffee");
        System.out.print("\nThe size of the array list was increased:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task21(ArrayList<T> arrayList, T element) {
        System.out.println("21. Replace the second element of an ArrayList with the specified element");
        System.out.print("The original array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        arrayList.set(1, element);
        System.out.print("\nThe array list's size after replacement of second element:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task22(ArrayList<T> arrayList, int position) {
        System.out.println("22. Print all the elements of a ArrayList using the position of the elements");
        System.out.print("The original array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.print("\nThe array list using the position " + position + " of the element:\n\t");
        for (int i = position; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println("\n");
    }
}
