package homework7.task1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String object please.. ");
        String string = in.nextLine();
        getInfo(string);
    }

    public static void getInfo(String string) {
        HashMap<Character, Integer> map = new HashMap<>();
        String line = string.toUpperCase(Locale.ROOT);
        int sumOfLetters = 0;
        int sumOfSpaces = 0;
        int sumOfDigits = 0;
        int sumOfSpec = 0;
        for(int i = 0; i < line.length() ; i++) {
            char c = line.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.print("All letters of the string object and the amount of their appearance:\n\t");
        for (Character c : map.keySet()) {
            if (Character.isLetter(c)) {
                //System.out.print(c + "=" + map.get(c) + "\t");
                sumOfLetters += map.get(c);
            }
            if (Character.isSpaceChar(c)) {
                sumOfSpaces += map.get(c);
            }
            if (Character.isDigit(c)) {
                sumOfDigits += map.get(c);
            }
            if (c.toString().matches("[.,;:?!-]")) {
                sumOfSpec += map.get(c);
            }
        }

        System.out.println("\nThe general amount of letters is: " + sumOfLetters);
        System.out.println("The general amount of space characters is: " + sumOfSpaces);
        System.out.println("The general amount of digits is: " + sumOfDigits);
        System.out.println("The general amount of special characters (. , ; : ? ! -) is: " + sumOfSpec);
    }
}
