package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        projects.forEach((x, y) ->{
            if (y.contains(developer)){
                list.add(x);
            }
        });
        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() > o2.length()){
                return -1;
            } else if (o1.length() == o2.length()) {
                if (o1.compareTo(o2) > 0){
                    return -1;
                } else if (o1.compareTo(o2) < 0) {
                    return 1;
                }else {
                    return 0;
                }
            }else {
                return 1;
            }
        };
        list.sort(comparator);
        return list;
    }
}
