package com.Algorithm.LeetCode;


public class IsomorphicStrings {
    public static void main(String[] args){
        String s = "accdddaae";
        String t = "deeaaaddc";
        System.out.print(isIsomorphic(s,t));
    }

    private static boolean isIsomorphic(String s, String t) {
        if(s.length() == 0) return true;
        int[] freqs = new int[128];
        int[] freqt = new int[128];
        int counts = 33;
        int countt = 33;
        char[] sc = s.toCharArray();
        char[] st = t.toCharArray();
        for(int i = 0; i < sc.length; i++){
            char c = sc[i];
            char cc = st[i];
            if(freqs[c] == 0){
                freqs[c] = counts;
                sc[i] = (char)counts;
                counts++;
            }
            else{
                sc[i] = (char)freqs[c];
            }
            if(freqt[cc] == 0){
                freqt[cc] = countt;
                st[i] = (char)countt;
                countt++;
            }
            else{
                st[i] = (char)freqt[cc];
            }
        }
        if(String.valueOf(sc).equals(String.valueOf(st))) return true;
        else return false;

    }


}
