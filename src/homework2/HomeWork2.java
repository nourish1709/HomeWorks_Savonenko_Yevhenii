package homework2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(questions);

        Cycle:
        while(true){
            System.out.println("\nWhat task do you want to be done?");
            int num = input.nextInt();
            switch (num){
                case 1: // the answer to a question
                    System.out.println(answer);
                    break;
                case 2: // sort an array by DESC
                    Integer[] integerArray = {2, 3, 1, 7, 11};
                    System.out.println("Unsorted array:");
                    printArray(integerArray);
                    Arrays.sort(integerArray, Collections.reverseOrder());
                    System.out.println("Sorted array:");
                    printArray(integerArray);
                    break;
                case 3: // Sum of positive numbers of array
                    Integer[] array = inputArray();
                    System.out.println("Sum of all positive numbers of array is " + sumOfPositiveNumbers(array));
                    break;
                case 4: // The average of a list of numbers
                    Integer[] arrayOfIntegers = inputArray();
                    System.out.println("The average of an array is " + getAverageOfNumbers(arrayOfIntegers));
                    break;
                case 5:
                    Integer[] numberArray = {3, 2, 3, 1, 4, 2, 8, 3};
                    System.out.println("All duplicated values were replaced by 0");
                    printArray(replaceValues(numberArray));
                    break;
                case 0:
                    break Cycle;
            }
        }
    }

    static int sumOfNumbers(Integer[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }

    static int sumOfPositiveNumbers(Integer[] array){
        int sum = 0;
        for(int i : array){
            if(i > 0)
                sum += i;
        }
        return sum;
    }

    static double getAverageOfNumbers(Integer[] array){
        return (double) (sumOfNumbers(array)) / array.length;
    }

    static Integer[] replaceValues(Integer[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = array.length - 1; j > i; j--){
                if(array[j].equals(array[i]))
                    array[j] = 0;
            }
        }
        return array;
    }

    static Integer[] inputArray(){
        System.out.println("\nHow many numbers do you want to enter?");
        int num = input.nextInt();
        Integer[] array = new Integer[num];
        System.out.println("Enter an array of numbers please..");
        for (int i = 0 ; i < num; i++ ) {
            array[i] = input.nextInt();
        }
        return array;
    }

    static void printArray(Integer[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static Scanner input = new Scanner(System.in);

    static String questions = "\n1. Find the answer to the next question: Why arrays in java initialize with fixed size and can’t be dynamic?\n" +
            "\n2. Create next array of Integers with values: 2,3,1,7,11. Sort them by DESC(reverseOrder).\n" +
            "\n3. You get an array of numbers(should contain both positive and negative numbers), and return the sum of all the positive ones. (If there are nothing to sum, sum should be 0)\n" +
            "\n4. You get an array of numbers, return the average of a list of numbers in this array. (Example -  array{1,2,4,1} -> avg = 2)\n" +
            "\n*5. You have array {3,2,3,1,4,2,8,3}. Replace all duplicated values by 0. Result should be  next: {3,2,0,1,4,0,8,0}\n" +
            "\n0. Exit";
    static String answer = "\nThe reason is that it is significantly more complex to implement a variable-length container, " +
            "and there are a number of strategies for achieving it under the hood (linked list, memory re-allocation ...)\n" +
            "if the authors defined arrays to be variable-length back in the early 1990s, there would have been several unwanted consequences:\n" +
            "\t- the core JVM definition of arrays would be far more complex, and all implementations would be forced to provide this complexity at a low level;\n" +
            "\t- there would be a \"one-size fits all\" resizing implementation in a given JVM, which might fail to satisfy many use-cases\n" +
            "\t- different implementations are likely to introduce large performance variances, which might need additional complicated constraint definition;\n" +
            "\t- it introduces thread-safety issues around bounds-checking the array, because a.length becomes mutable;\n" +
            "\t- additional linguistic support for expressing expansion => larger language;\n" +
            "\t- performance implications for array subscripting, potential lack of O(1) indexing;\n" +
            "\t- unfamiliar territory for C and C++ programmers, who are used to non-extensible arrays (or having such mechanisms provided in libraries);\n" +
            "\t- casting in stone a variable-length mechanism already adequately handled by higher-level structures (java.util.Vector back in the day, and now Java Collections, Guava etc)\n";
}
