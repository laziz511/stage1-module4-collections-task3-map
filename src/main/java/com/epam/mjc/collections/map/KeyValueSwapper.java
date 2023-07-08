package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new HashMap<>();
        for (Integer number : sourceMap.keySet()) {
            String word = sourceMap.get(number);

            if (map.containsKey(word)) {
                map.put(word, Math.min(number, map.get(word)));
            } else {
                map.put(word, number);
            }

        }

        return map;
    }
}
