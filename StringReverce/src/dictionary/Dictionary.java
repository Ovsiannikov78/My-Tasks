package dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Есть словарь (Set<String>) - набор слов(маленькие буквы).
 * Есть строка text.
 * Вернуть лист слов, являющихся разбиением текста, если текст можно разбить на слова из словаря либо null
 * словарь: {hello, world, super}
 * text: hellosuper  -> {hello, super}
 * text: supersuper -> {super, super}
 * text: superhellosuper -> {super, hello, super}
 * text: superhelloo ->null *Текст должен полностью разбиваться на слова из словаря
 * (*есть решение через рекурсию и .startWith() )
 */

public class Dictionary {

    public List<String> dictionary(Set<String> dict, String text) {
        List<String> res = new ArrayList<>();
        int size = dict.size();

        while (size > 0 || text.length() > 0) {
            for (String elem : dict) {
                size--;
                if (text.startsWith(elem)) {
                    res.add(elem);
                    text = text.substring(elem.length());
                    dictionary(dict, text);
                }
            }
        }
        return res;
    }
}
