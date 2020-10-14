import java.util.function.Function;
import java.util.function.Predicate;

public class Solution {

    //"abc defG ikl" -> "ABC defG IKL"
    // length == 3 -> toUpperCase
    public static void main(String[] args) {

        String sentence = "abc defG ikl";
        System.out.println(transformer(sentence));
    }

    public static String transformer(String sentence) {
        Predicate<String> p = s -> s.length() == 3;
        Function<String, String> f = String::toUpperCase;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (p.test(words[i])) {
                words[i] = f.apply(words[i]);
            }
        }
        return String.join(" ", words);
    }
}