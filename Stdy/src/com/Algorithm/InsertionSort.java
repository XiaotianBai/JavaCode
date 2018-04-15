package com.Algorithm;


import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {25, 13, 10, 16, 5, 8, 1};
        sortArray(arr);

    }

    public static void sort(ArrayList<Integer> al) {
        int i = 1;
        while (i < al.size()) {
            int j = i - 1;
            int key = al.get(i);
            while (j >= 0 && al.get(j) > key) {
                al.set(j + 1, al.get(j));
                al.set(j, key);
                //  key = al.get(i);
                j = j - 1;
            }
            i = i + 1;
        }

    }

    private static void sortArray(int[] nums) {
        int i = 1;
        while (i < nums.length) {
            int j = i - 1;
            int key = nums[i];
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                nums[j] = key;
                j = j - 1;
            }
            System.out.println(Arrays.toString(nums));
            i = i + 1;
        }

    }
}
