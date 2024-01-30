package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        sourceMap.forEach((x, y) ->{
            if(map.containsKey(x.length())){
                map.get(x.length()).add(x);
            }else {
                Set<String> set = new HashSet<>();
                set.add(x);
                map.put(x.length(),set);
            }
        });
        return map;
    }
}
