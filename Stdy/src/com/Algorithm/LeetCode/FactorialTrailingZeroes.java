package com.Algorithm.LeetCode;

public class FactorialTrailingZeroes {
    public static void main(String[] args){
        System.out.println(trailingZeroes(625));
        System.out.println(simpleSolution(625));
    }

    private static int trailingZeroes(int n) {
        int factorTwos = 0;
        int factorFives = 0;
        factorTwos += n / 2;
        int i = 2;
        double j = Math.pow(2, i);
        while(n >= j){
            i++;
            factorTwos += n / j;
            j = Math.pow(2, i);
        }
        factorFives += n / 5;
        i = 2;
        j = Math.pow(5, i);
        while(n >= j){
            i++;
            factorFives += n / j;
            j = Math.pow(5, i);
        }
        return Math.min(factorFives, factorTwos);
    }
    //note : factorFives is always smaller than factorTwos, the solution hence can be simplified by focusing only
    //on factorFives.

    private static int simpleSolution(int n){
        return n==0?0:(n/5)+trailingZeroes(n/5);
    }
    private static int brutalForce(int n){
        int res = 0;
        int factorTwos = 0;
        int factorFives = 0;

        while(n > 2){
            int temp = n;
            while(temp % 10 == 0){
                res++;
                temp = temp / 10;
            }
            while(temp % 2 == 0){
                factorTwos++;
                temp = temp / 2;

            }
            while(temp % 5 == 0){
                factorFives++;
                temp = temp / 5;

            }
            n--;
        }
        res += Math.min(factorFives, factorTwos);
        return res;
    }
}
