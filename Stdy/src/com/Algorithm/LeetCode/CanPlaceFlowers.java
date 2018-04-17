package com.Algorithm.LeetCode;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n > (flowerbed.length / 2 + 1)) return false;
        boolean inZero = false;
        int pos = 0;
        int zeroCnt = 0;
        int res = 0;
        if (flowerbed[0] == 0) {
            while (pos < flowerbed.length && flowerbed[pos] == 0) {
                zeroCnt++;
                pos++;
            }
            if (pos < flowerbed.length - 1) res += ((zeroCnt - 1) / 2 + 1);
            else return (zeroCnt / 2 + 1) >= n;
        }
        zeroCnt = 0;
        while (pos < flowerbed.length - 1) {
            pos++;
            int num = flowerbed[pos];
            if (num == 0 && inZero) zeroCnt++;
            else if (num == 0) {
                inZero = true;
                zeroCnt++;
            } else if (num == 1 && inZero) {
                inZero = false;
                System.out.println(zeroCnt);
                res += ((zeroCnt - 2) / 2 + 1);
                zeroCnt = 0;
            }
        }
        System.out.println(res);
        if (zeroCnt > 0) res += ((zeroCnt - 1) / 2 + 1);
        return res >= n;
    }
}
