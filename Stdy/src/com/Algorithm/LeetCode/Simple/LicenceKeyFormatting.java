package com.Algorithm.LeetCode.Simple;

public class LicenceKeyFormatting {
    public static void main(String[] args){
        String S = "2-5g-3-j--";
        System.out.print(licenceKEyFormatting(S,2));
    }

    private static String licenceKEyFormatting(String S, int K){
        int count = 0;
        char[] chars = S.toCharArray();
        StringBuilder res = new StringBuilder();
        for(char c : chars){
            if(c != '-') count++;
        }
        int remainder = count % K;
        int i = 0, rem = remainder;
        while(rem > 0){
            char temp = chars[i];
            if(temp != '-'){
                rem --;
                res.append(temp);
                i++;
            }
            else i++;
        }
        if(remainder > 0 && i < chars.length)res.append('-');
        int KCount = 0;
        while(i < chars.length){
            char temp = chars[i];
            if(KCount == K && temp != '-'){
                res.append('-');
                KCount = 0;
            }
            if(temp != '-'){
                remainder --;
                res.append(temp);
                i++;
                KCount++;
            }
            else i++;
        }
        return res.toString().toUpperCase();
    }
}
