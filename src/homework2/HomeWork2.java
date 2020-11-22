package homework2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("\nWhy arrays in java initialize with fixed size and can't be dynamic?");
        System.out.println("\nThe reason is that it is significantly more complex to implement a variable-length container, " +
                "and there are a number of strategies for achieving it under the hood (linked list, memory re-allocation ...)\n" +
                "if the authors defined arrays to be variable-length back in the early 1990s, there would have been several unwanted consequences:\n" +
                "\t- the core JVM definition of arrays would be far more complex, and all implementations would be forced to provide this complexity at a low level;\n" +
                "\t- there would be a \"one-size fits all\" resizing implementation in a given JVM, which might fail to satisfy many use-cases\n" +
                "\t- different implementations are likely to introduce large performance variances, which might need additional complicated constraint definition;\n" +
                "\t- it introduces thread-safety issues around bounds-checking the array, because a.length becomes mutable;\n" +
                "\t- additional linguistic support for expressing expansion => larger language;\n" +
                "\t- performance implications for array subscripting, potential lack of O(1) indexing;\n" +
                "\t- unfamiliar territory for C and C++ programmers, who are used to non-extensible arrays (or having such mechanisms provided in libraries);\n" +
                "\t- casting in stone a variable-length mechanism already adequately handled by higher-level structures (java.util.Vector back in the day, and now Java Collections, Guava etc)\n");

        int[] intArray = {2, 3, 1, 7, 11};
        System.out.println("Unsorted array:");
        printArray(intArray);
        Arrays.sort(intArray);
        System.out.println("Sorted array:");
        printArray(intArray);

    }

    static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
