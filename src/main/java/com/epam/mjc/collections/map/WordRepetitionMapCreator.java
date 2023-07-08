package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordsFrequency = new HashMap<>();

        String[] words = sentence.toLowerCase().split("\\W+");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordsFrequency.put(word, wordsFrequency.getOrDefault(word, 0) + 1);
            }
        }
        return wordsFrequency;
    }
}
