package com.Algorithm.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public static void main(String[] args) {
        PartitionLabels p = new PartitionLabels();
        System.out.print(p.partitionLabels("ababcbacadefegdehijhklij"));
        //System.out.print(p.partitionLabels("abcdefghijklmnopqrstuvwxyz"));
    }

    public List<Integer> partitionLabels(String S) {
        char[] chars = S.toCharArray();
        int[] positions = new int[26];
        for (int i = 0; i < chars.length; i++) {
            positions[chars[i] - 'a'] = i;
        }

        int cur = 0;
        int pre = -1;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (positions[chars[i] - 'a'] > cur) {
                cur = positions[chars[i] - 'a'];
            }
            if (i == cur) {
                ans.add(cur - pre);
                pre = cur;
            }
        }
        return ans;
    }
}
