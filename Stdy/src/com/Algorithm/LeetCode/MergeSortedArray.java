package com.Algorithm.LeetCode;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur1 = 0, cur2 = 0, cur3 = m;
        while (cur3 < m + n) {
            if (cur2 >= n || (cur1 < m && nums1[cur1] < nums2[cur2])) {
                nums1[cur3] = nums1[cur1];
                cur1++;
                cur3++;
            }
            else {
                nums1[cur3] = nums2[cur2];
                cur2++;
                cur3++;
            }
        }
        cur3 = 0;
        while (cur3 < m) {
            if (cur2 >= n || (cur1 < m && nums1[cur1] < nums2[cur2])) {
                nums1[cur3++] = nums1[cur1++];
            }
            else {
                nums1[cur3++] = nums2[cur2++];
            }
        }
        System.arraycopy(nums1, m, nums2, 0, n);
        System.arraycopy(nums1, 0, nums1, n, m);
        System.arraycopy(nums2, 0, nums1, 0, n);
    }

    public static void main(String[] args) {
        MergeSortedArray t = new MergeSortedArray();
        int[] nums1 = {1,3,5,7,8,9,0,0,0,0,0,0};
        int[] nums2 = {2,4,5,6,8,9};
        t.merge(nums1,6, nums2, 6);
        System.out.println(Arrays.toString(nums1));
    }
}
