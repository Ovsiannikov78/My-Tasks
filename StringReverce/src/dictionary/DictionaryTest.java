package dictionary;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {
    Dictionary dict = new Dictionary();

    Set<String> dictionary = new HashSet<>(Arrays.asList("puper", "developer", "hello", "super", "java", "python", "php"));

    @Test
    void testDictionary_1() {
        String text = "hellosuper";

        List<String> exp = Arrays.asList("hello", "super");
        List<String> act = dict.dictionary(dictionary, text);

        assertEquals(exp, act);
    }

    @Test
    void testDictionary_2() {
        String text = "superpuper";

        List<String> exp = Arrays.asList("super", "puper");

        List<String> act = dict.dictionary(dictionary, text);

        assertEquals(exp, act);
    }

    @Test
    void testDictionary_3() {
        String text = "superpuperjavadeveloper";

        List<String> exp = Arrays.asList("super", "puper", "java", "developer");

        List<String> act = dict.dictionary(dictionary, text);

        assertEquals(exp, act);
    }

    @Test
    void testDictionary_4() {
        String text = "helloscala";

        List<String> exp = Collections.emptyList();

        List<String> act = dict.dictionary(dictionary, text);

        assertEquals(exp, act);
    }
}