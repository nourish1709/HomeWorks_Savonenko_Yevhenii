package homework9;

public class HeavyString {
    private static String word = " ";

    private HeavyString() { }

    public static void incrementWord() {
        word += word;
    }
}