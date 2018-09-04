package com.Algorithm.LeetCode;

import java.util.Arrays;

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        if (head == null) return 0;
        int leng = 0;
        int ans = 0;
        ListNode cur = head;
        while (cur != null) {
            leng++;
            cur = cur.next;
        }
        int i = leng;
        boolean[] used = new boolean[leng];
        Arrays.fill(used, false);
        for (int aG : G) {
            used[aG] = true;
        }
        cur = head;
        boolean connected = false;
        while (i > 0) {
            if (used[cur.val]) {
                if (!connected) {
                    ans++;
                    connected = true;
                }
            }
            else connected = false;
            cur = cur.next;
            i--;
        }
        return ans;
    }
}
