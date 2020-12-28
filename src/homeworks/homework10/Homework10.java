package homeworks.homework10;

import java.util.*;
import java.util.stream.Collectors;

public class Homework10 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        showText();
        calcPercentage();
    }

    public static void showText() {
        String textMark = "";
        int numMark;
        boolean wrongNum = true;

        System.out.print("Enter a numerical mark from 0 to 10 please.. ");
        while (wrongNum) {
            numMark = in.nextInt();
            textMark = switch (numMark) {
                case 0, 1, 2, 3, 4 -> {
                    wrongNum = false;
                    yield "Very Bad";
                }
                case 5 -> {
                    wrongNum = false;
                    yield "Bad";
                }
                case 6 -> {
                    wrongNum = false;
                    yield "Acceptable";
                }
                case 7, 8 -> {
                    wrongNum = false;
                    yield "Good";
                }
                case 9, 10 -> {
                    wrongNum = false;
                    yield "Well";
                }
                default -> {
                    System.out.print("Only numbers from 0 to 10 are allowed. Enter again please.. ");
                    yield "null";
                }
            };
        }

        System.out.println("The mark is: " + textMark);
    }

    public static void calcPercentage() {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the array's size please.. ");
        int size = in.nextInt();

        System.out.print("Enter the array please..\n\t");
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }

        double percentage =
                list.stream()
                        .collect(Collectors.teeing(
                                Collectors.toSet(),
                                Collectors.counting(),
                                (Set<Integer> set, Long count) -> (double) set.size() / count
                        ));

        System.out.println("The percentage of unique numbers is " + percentage);
    }
}
