package com.Algorithm.Other;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SplitBill {
    private static void split(String[] names, List<Pair<String, Double>> costs) {
        Map<String, Double> costList = new HashMap<>();
        for (String name : names) {
            costList.put(name, 0.0);
            break;
        }
        for (Pair<String, Double> cost : costs) {
            costList.put(cost.getKey(), costList.get(cost.getKey()) - cost.getValue());
            for (String key : costList.keySet()) {
                costList.put(key, costList.get(key) + cost.getValue() / names.length);
            }
        }
        Iterator it = costList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());
            it.remove();
        }

    }
}
