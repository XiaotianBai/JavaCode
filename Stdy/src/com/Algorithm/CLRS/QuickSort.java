package com.Algorithm.CLRS;

import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {13, 19, 10, 9, 8, 7, 5, 4, 1, 2, 6, 11, 14};

        System.out.println("Unsorted array: " +
                QuickSort.toString(array));
        quickSort.lomutoQuickSort(array);

        System.out.println("Sorted array:   " +
                QuickSort.toString(array));
        if (args.length == 1) {
            array = new int[Integer.parseInt(args[0])];
            Random generator = new Random();
            final int MAX = 200;
            for (int i = 0; i < array.length; i++)
                array[i] = generator.nextInt(MAX);
            long startTime = System.currentTimeMillis();
            QuickSort.sort(array);
            long stopTime = System.currentTimeMillis();
            System.out.println("Time to sort " + args[0] +
                    " random integers in range 1 - 200: " +
                    (stopTime - startTime) + "ms");
        }
    }

    public void lomutoQuickSort(int nums[]) {
        lomutoQuickSort(nums, 0, nums.length - 1);

    }

    private void lomutoQuickSort(int nums[], int lo, int hi) {
        System.out.println(QuickSort.toString(nums));
        if (lo < hi) {
            int pivot = lomutoPartition(nums, lo, hi);
            lomutoQuickSort(nums, lo, pivot - 1);
            lomutoQuickSort(nums, pivot + 1, hi);

        }
    }

    private int lomutoPartition(int nums[], int lo, int hi) {
        int pivot = nums[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (nums[j] <= pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, hi); // replace the guard element
        return i;
    }


    public void hoareQuickSort(int nums[]) {
        hoareQuickSort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.println(num);
        }
    }

    private void hoareQuickSort(int nums[], int lo, int hi) {
        if (lo < hi) {
            int pivot = hoarePartition(nums, lo, hi);
            hoareQuickSort(nums, lo, pivot);
            hoareQuickSort(nums, pivot + 1, hi);

        }
    }

    private int hoarePartition(int nums[], int lo, int hi) {
        int pivot = nums[lo];
        int i = lo, j = hi;
        while (true) {
            while (nums[i] < pivot) {
                i++;
            }

            while (nums[j] >= pivot) {
                j--;
            }

            if (i >= j) {
                return j;
            }

            swap(nums, i, j);
        }
    }

    private void swap(int nums[], int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public static void sort(int[] array) {

        Quicksort(array, 0, array.length - 1);
    }


    private static void Quicksort(int[] array, int first, int last) {
        System.out.println(QuickSort.toString(array));
        if (first < last) {


            int mid = partition(array, first, last);

            Quicksort(array, first, mid);

            Quicksort(array, mid + 1, last);


        }
    }

    private static int partition(int array[], int first, int last) {

        int x = array[first];

        int i = first - 1;

        int j = last + 1;

        while (true) {

            do {
                j--;

            } while (array[j] > x);

            do {

                i++;

            } while (array[i] < x);

            if (i < j) {

                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;

            } else

                return j;
        }
    }


    public static String toString(int[] array) {

        String s = "[";
        for (int i = 0; i < array.length; i++)
            s += " " + array[i];
        s += " ]";
        return s;
    }


}