package homeworks.homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTasks {
    public LinkedListTasks() {
        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(-45645, 2348, -7896532, 32930256, 602856, 104865));
        LinkedList<Double> doubles = new LinkedList<>(Arrays.asList(641.15648, -48894651.2189, 78965123.240456, -968451.126, 1.254986, 0.24853));
        LinkedList<String> strings = new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));

        System.out.println("\n\n");
        task1(integers, 1);
        task2(integers);
        task3(integers, 2);
        task4(integers);
        task5(integers, 463, 4);
        task6(integers, -1, 1);
        task7(integers, 245);
        task8(integers, -978);
        task9(integers, new LinkedList<Integer>(Arrays.asList(-45, 156, 5487, 3159)), 2);
        task10(integers, new LinkedList<Integer>(Arrays.asList(1, 2 , 245)));
        task11(integers);
        task12(integers, 1);
        task13(integers);
        task14(integers);
        task15(doubles, 2, 5);
        task16(doubles);
        task17(new LinkedList<Integer>(Arrays.asList(-45, 156, 5487, 3159)), new LinkedList<Integer>(Arrays.asList(1238, -9456, 3246, 4576)));
        task18(doubles);
        task19(doubles);
        task20(strings);
        task21(strings);
        task22(strings, "nine");
        task23(strings);
        task24(strings, new LinkedList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven")));
        task25(doubles);
        task26(strings, 2, "ten");
    }

    private <T> void task1(LinkedList<T> linkedList, T element) {
        System.out.println("1. Append the specified element to the end of a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.addLast(element);
        System.out.print("\nThe linked list with appended element:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task2(LinkedList<T> linkedList) {
        System.out.println("2. Iterate through all elements in a linked list");
        System.out.print("Iteration through elements:\n\t");
        for (T t : linkedList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task3(LinkedList<T> linkedList, int position) {
        System.out.println("3. Iterate through all elements in a linked list starting at the specified position");
        System.out.print("Iteration through elements starting at position " + position + ":\n\t");
        for (int i = position; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println("\n");
    }


    private <T> void task4(LinkedList<T> linkedList) {
        System.out.println("4. Iterate a linked list in reverse order");
        System.out.print("Iteration through elements in reverse order:\n\t");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }
        System.out.println("\n");
    }

    private <T> void task5(LinkedList<T> linkedList, T element, int position) {
        System.out.println("5. Insert the specified element at the specified position in the linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.add(position, element);
        System.out.print("\nThe element " + element + " was added at position " + position + ". The updated linked list:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task6(LinkedList<T> linkedList, T first, T last) {
        System.out.println("6. Insert elements into the linked list at the first and last position");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.addFirst(first);
        linkedList.addLast(last);
        System.out.print("\nThe updated linked list:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task7(LinkedList<T> linkedList, T element) {
        System.out.println("7. Insert the specified element at the front of a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.offerFirst(element);
        System.out.print("\nThe updated linked list:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task8(LinkedList<T> linkedList, T element) {
        System.out.println("8. Insert the specified element at the end of a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.offerLast(element);
        System.out.print("\nThe updated linked list:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task9(LinkedList<T> linkedList, LinkedList<T> newLinkedList, int position) {
        System.out.println("9. Insert some elements at the specified position into a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        System.out.print("\nThe linked list to be inserted:\n\t");
        printLinkedList(newLinkedList);
        linkedList.addAll(position, newLinkedList);
        System.out.print("\nThe merged linked list:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task10(LinkedList<T> linkedList, LinkedList<T> elements) {
        System.out.println("10. Get the first and last occurrence of the specified elements in a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        System.out.println();
        for (T t : elements) {
            if (linkedList.indexOf(t) != -1) {
                System.out.println("the first occurance of the element " + t + " in a linked list is at the position " + linkedList.indexOf(t));
                System.out.println("the last occurance of the element " + t + " in a linked list is at the position " + linkedList.lastIndexOf(t));
            }
        }
        System.out.println("");
    }

    private <T> void task11(LinkedList<T> linkedList) {
        System.out.println("11. Display the elements and their positions in a linked list");
        System.out.print("The linked list:\n\t");
        for(int i = 0; i < linkedList.size(); i++) {
            System.out.print("element: " + linkedList.get(i) + ", position: " + i + "\t");
        }
        System.out.println("\n");
    }

    private <T> void task12(LinkedList<T> linkedList, T element) {
        System.out.println("12. Remove a specified element from a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        while (linkedList.contains(element)) {
            linkedList.remove(element);
        }
        System.out.print("\nThe linked list after removing the element " + element + ":\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task13(LinkedList<T> linkedList) {
        System.out.println("13. Remove first and last element from a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.print("\nThe linked list after removing the first and last elements:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task14(LinkedList<T> linkedList) {
        System.out.println("14. Remove all the elements from a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.clear();
        System.out.print("\nThe linked list after removing all the elements:\n\t");
        printLinkedList(linkedList);
        System.out.println("");
    }

    private <T> void task15(LinkedList<T> linkedList, int first, int second) {
        System.out.println("15. Swap two elements in a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        Collections.swap(linkedList, first, second);
        System.out.print("\nThe linked list after swaping the elements at positions " + first + " and " + second + ":\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task16(LinkedList<T> linkedList) {
        System.out.println("16. Shuffle the elements in a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        Collections.shuffle(linkedList);
        System.out.print("\nThe shuffled linked list :\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task17(LinkedList<T> linkedList1, LinkedList<T> linkedList2) {
        System.out.println("17. Join two linked lists");
        System.out.print("The first linked list:\n\t");
        printLinkedList(linkedList1);
        System.out.print("\nThe second linked list:\n\t");
        printLinkedList(linkedList2);
        LinkedList<T> mergedLinkedList = new LinkedList<>();
        mergedLinkedList.addAll(linkedList1);
        mergedLinkedList.addAll(linkedList2);
        System.out.print("\nThe shuffled linked list :\n\t");
        printLinkedList(mergedLinkedList);
        System.out.println("\n");
    }

    private <T> void task18(LinkedList<T> linkedList) {
        System.out.println("18. Clone a linked list to another linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        LinkedList<T> copyList = (LinkedList<T>) linkedList.clone();
        System.out.print("\nThe cloned linked list :\n\t");
        printLinkedList(copyList);
        System.out.println("\n");
    }

    private <T> void task19(LinkedList<T> linkedList) {
        System.out.println("19. Remove and return the first element of a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        System.out.print("\nThe removed element is " + linkedList.removeFirst());
        System.out.print("\nThe  linked list:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task20(LinkedList<T> linkedList) {
        System.out.println("20. Retrieve but do not remove, the first element of a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        System.out.print("\nThe retrieved element is " + linkedList.peek());
        System.out.print("\nThe  linked list wasn't changed:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task21(LinkedList<T> linkedList) {
        System.out.println("21. Retrieve but do not remove, the first element of a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        System.out.print("\nThe retrieved element is " + linkedList.peekLast());
        System.out.print("\nThe  linked list wasn't changed:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void task22(LinkedList<T> linkedList, T element) {
        System.out.println("22. Check if a particular element exists in a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        if (linkedList.contains(element)) {
            System.out.println("\nThe linked list contains the element: " + element);
        }
        else {
            System.out.println("\nThe linked list doesn't contain the element: " + element);
        }
        System.out.println("");
    }

    private <T> void task23(LinkedList<T> linkedList) {
        System.out.println("23. Convert a linked list to array list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        ArrayList<T> arrayList = new ArrayList<>(linkedList);
        System.out.print("\nThe array list:\n\t");
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.println("\n");
    }

    private <T> void task24(LinkedList<T> linkedList1, LinkedList<T> linkedList2) {
        System.out.println("24. Compare two linked lists");
        System.out.print("The first linked list:\n\t");
        printLinkedList(linkedList1);
        System.out.print("\nThe second linked list:\n\t");
        printLinkedList(linkedList2);
        if (linkedList1.equals(linkedList2)) {
            System.out.println("\nTwo linked lists are equal");
        }
        else {
            System.out.println("\nThe linked lists aren't equal");
        }
        System.out.println("");
    }

    private <T> void task25(LinkedList<T> linkedList) {
        System.out.println("25. Test a linked list is empty or not");
        if (linkedList.isEmpty()) {
            System.out.print("The linked list is empty");
        }
        else {
            System.out.print("The linked list isn't empty:\n\t");
            printLinkedList(linkedList);
        }
        System.out.println("\n");
    }

    private <T> void task26(LinkedList<T> linkedList, int index, T element) {
        System.out.println("26. Replace an element in a linked list");
        System.out.print("The original linked list:\n\t");
        printLinkedList(linkedList);
        linkedList.set(index, element);
        System.out.print("\nThe element " + index + " was replaced:\n\t");
        printLinkedList(linkedList);
        System.out.println("\n");
    }

    private <T> void printLinkedList(LinkedList<T> linkedList) {
        for (T t : linkedList) {
            System.out.print(t + " ");
        }
    }
}
