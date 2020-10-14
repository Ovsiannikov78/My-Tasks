import sun.util.resources.cldr.nn.CalendarData_nn_NO;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * Анаграмма слова x  - слово, по длине равное x и состоящее из таких же букв,что и x.
 * Например, слово “vani” является анаграммой слова “ivan”, а слова“naan” и “anan” являются анаграммами слова “anna”.
 * Дан словарь, сожержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
 * Написать функцию, которая по слову из словаря вернет все анаграммы этогослова, которые есть в словаре.
 * ivan -> {"navi", "vani"}
 * anna -> {"anna", "naan", "nana", "anan"};
 */

public class Solution {
    public static List<String> words = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "nana", "anan", "navi");
    public static Map<String, List<String>> anagrammsMap;

    public Solution(List<String> words) {
        anagrammsMap = bildMapOfAnagramms(words);
    }

    public List<String> getAnagramms(String word) {
        String sortedWord = getStringSortedByLetters(word);
        return anagrammsMap.get(sortedWord);
    }

    private Map<String, List<String>> bildMapOfAnagramms(List<String> words) {
        Map<String, List<String>> anagramms = new HashMap<>();
        for (String str : words) {
            List<String> anagrammValueList = anagramms.get(getStringSortedByLetters(str));
            if (anagrammValueList == null) {
                anagrammValueList = new ArrayList<>();
                anagrammValueList.add(str);
                anagramms.put(getStringSortedByLetters(str), anagrammValueList);
            } else {
                anagrammValueList.add(str);
            }
        }
        return anagramms;
    }

    private String getStringSortedByLetters(String word) {
        return Stream.of(word.split(""))
                .sorted()
                .collect(Collectors.joining());
    }
}
