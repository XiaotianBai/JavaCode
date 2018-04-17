package com.Algorithm.LeetCode;

import java.util.Arrays;

public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
        if(houses.length == 0) return 0;
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int res = 0, house = 0, heater = 0, pos = 0;
        for (int i = 0; i < houses.length; i++) {
            house = houses[i];
            boolean found = false;
            for (int j = pos; j < heaters.length; j++) {
                heater = heaters[j];
                if (heater >= house) {
                    if (j == 0) {
                        res = Math.max(res, heater - house);
                        found = true;
                        break;
                    }
                    res = Math.max(res, Math.min(heater - house, house - heaters[pos - 1]));
                    found = true;
                    break;
                }
                else pos++;
            }
            if (!found) res = Math.max(res, house - heaters[pos - 1]);
        }
        return res;
    }
}
