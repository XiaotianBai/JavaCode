package com.Algorithm.CLRS;

import java.util.Arrays;

public class NewPartition {
    public static void main(String[] args){
        int[] A = {4, 3, 9, 6, 2, 3, 4, 3, 1, 5, 3, 4, 5,6 ,1, 2, 5};
        newPartition(A);
        System.out.println(Arrays.toString(A));
    }

    private static int[] newPartition(int[] A){
        int r = A.length - 1;
        int x = A[r];
        exchange(A, 0, r);
        int i = -1;
        int k = 0;
        for(int j = 1; j < r + 1; j++){
            if(A[j] < x){
                i = i + 1;
                k = k + 1;
                exchange(A, i, j);
                exchange(A, k, j);
            }

            if(A[j] == x && j > k){
                k = k + 1;
                exchange(A, k, j);
            }


        }

        int[] ans = {i + 2, k + 1}; //start from 1
        return ans;
    }

    private static void exchange(int[] A, int m, int n){
        int temp = A[n];
        A[n] = A[m];
        A[m] = temp;
    }
}


