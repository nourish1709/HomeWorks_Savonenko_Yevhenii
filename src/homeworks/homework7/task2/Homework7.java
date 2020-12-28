package homeworks.homework7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Homework7 {

    static HashMap<String, Integer> map = new HashMap<>();
    static Map.Entry<String, Integer> theLongestWord;
    static Map.Entry<String, Integer> theSmallestWord;

    public static void main(String[] args) {
        String file;
        try (Scanner myReader = new Scanner(new File("src/resources/theBook.txt"))) {
            while (myReader.hasNextLine()) {
                file = myReader.nextLine();
                getWords(file);
            }
            getInfo();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred. File wasn't found");
            e.printStackTrace();
        }
    }

    public static void getWords(String file) {
        String[] words = file.split("((?<![A-Za-zА-Яа-я])-(?![A-Za-zА-Яа-я])|-(?![A-Za-zА-Яа-я])|(?<![A-Za-zА-Яа-я])-|[ .,!@#$%^&*()?\\[\\]/\\\'\";:\r\t\n\\v\\f\0\\d\\s])");

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        map.remove("");
    }

    public static void getInfo() {
        findMaxAndMin();
        System.out.println("\nThe longest word and the number of its appearances:\t\t" + theLongestWord.getKey() + ": " + theLongestWord.getValue());
        System.out.println("The smallest word and the number of its appearances:\t" + theSmallestWord.getKey() + ": " + theSmallestWord.getValue());
        System.out.print("\nAll words of the string object and the amount of their appearance:\n\t");
        //System.out.println("\n" + map);
    }

    public static void findMaxAndMin() {
        theLongestWord = theSmallestWord = map.entrySet().iterator().next();
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if (entry.getKey().length() - theLongestWord.getKey().length() > 0)
            {
                theLongestWord = entry;
            }
            else if (entry.getKey().length() - theLongestWord.getKey().length() == 0) {
                if (entry.getKey().compareToIgnoreCase(theLongestWord.getKey()) < 0) {
                    theLongestWord = entry;
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            if (entry.getKey().length() - theSmallestWord.getKey().length() < 0)
            {
                theSmallestWord = entry;
            }
            else if (entry.getKey().length() - theSmallestWord.getKey().length() == 0) {
                if (entry.getKey().compareToIgnoreCase(theSmallestWord.getKey()) < 0) {
                    theSmallestWord = entry;
                }
            }
        }
    }
}