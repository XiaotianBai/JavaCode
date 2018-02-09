package com.Algorithm.LeetCode.Simple;

public class GuessNumberHigherOrLower {
    public static void main(String[] args){
        System.out.print(guessNumer(2126753390));
    }

    private static int guess(int num){
        if(num > 1702766719) return -1;
        if(num < 1702766719) return 1;
        else return 0;
    }

    private static int guessNumer(int n){
        long mid = n / 2 + 1;
        int guessNum;
        long lo = 0;
        long hi = n;
        while(true){
            guessNum = (int)mid;
            if(guess(guessNum) == 0) {
                return guessNum;
            }
            if(guess(guessNum) == 1) {
                lo = mid;
                mid = (mid + hi) / 2 + 1;
            }
            if(guess(guessNum) == -1) {
                hi = mid;
                mid = (mid + lo)/ 2;
            }

        }

    }
}
