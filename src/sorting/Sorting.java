package sorting;

import java.util.List;

public class Sorting {

    public List<String> alphabetSorting(List<String> words) {

        for (int i = 0; words != null && i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).compareTo(words.get(j)) > 0) {
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }
        return words;
    }
}
