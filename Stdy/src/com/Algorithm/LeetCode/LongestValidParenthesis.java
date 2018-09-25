package com.Algorithm.LeetCode;

public class LongestValidParenthesis {

    int[] leftCount;
    int[] rightCount;
    int max = 0;

    public int bruteForce(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0) return 0;
        int[] leftCount = new int[s.length()];
        int[] rightCount = new int[s.length()];
        if (chars[0] == '(') {
            leftCount[0] = 1;
            rightCount[0] = 0;
        } else {
            leftCount[0] = 0;
            rightCount[0] = 1;
        }

        for (int i = 1; i < leftCount.length; i++) {
            leftCount[i] = chars[i] == '(' ? leftCount[i - 1] + 1 : leftCount[i - 1];
        }
        for (int i = 1; i < rightCount.length; i++) {
            rightCount[i] = chars[i] == ')' ? rightCount[i - 1] + 1 : rightCount[i - 1];
        }

        int[] length = new int[s.length()];
        int max = 0;
        for (int start = 0; start < chars.length; start++) {
            for (int end = start; end < chars.length; end++) {
                if (start == 0) {
                    if ((leftCount[end] < rightCount[end])) break;
                    if (leftCount[end] == rightCount[end]) {
                        //length[start] = end - start;

                        max = Math.max(max, end - start + 1);
                    }
                } else {
                    if ((leftCount[end] - leftCount[start - 1] < rightCount[end] - rightCount[start - 1])) break;
                    if (leftCount[end] - leftCount[start - 1] == rightCount[end] - rightCount[start - 1]) {
                        //length[start] = end - start;
                        max = Math.max(max, end - start + 1);
                    }
                }

            }
        }
        return max;
    }


    public int longestValidParentheses(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0) return 0;
        leftCount = new int[s.length()];
        rightCount = new int[s.length()];
        if (chars[0] == '(') {
            leftCount[0] = 1;
            rightCount[0] = 0;
        } else {
            leftCount[0] = 0;
            rightCount[0] = 1;
        }

        for (int i = 1; i < leftCount.length; i++) {
            leftCount[i] = chars[i] == '(' ? leftCount[i - 1] + 1 : leftCount[i - 1];
        }
        for (int i = 1; i < rightCount.length; i++) {
            rightCount[i] = chars[i] == ')' ? rightCount[i - 1] + 1 : rightCount[i - 1];
        }

        int start = 0;
        int end = 0;
        int nextStart = 0;
        while (start < chars.length - 1) {
            int flag = helper(start, end);
            if (flag == 0) {
                if (nextStart >= chars.length - 1) return max;
                start = nextStart;
                nextStart = start + 1;
                if (end < start) end = start;
            } else if (flag == 1) {
                nextStart = end + 1;
                if (end < chars.length - 1) end++;
                else return max;
            } else if (flag == 2) {
                if (end < chars.length - 1) end++;
                else if (nextStart >= chars.length - 1) return max;
                else {
                    start = nextStart;
                    nextStart = start + 1;
                }
            }

        }

        return max;
    }

    private int helper(int start, int end) {
        if (start == 0) {
            if ((leftCount[end] < rightCount[end])) return 0;
            if (leftCount[end] == rightCount[end]) {
                //length[start] = end - start;

                max = Math.max(max, end - start + 1);
                return 1;
            }
        } else {
            if ((leftCount[end] - leftCount[start - 1] < rightCount[end] - rightCount[start - 1])) return 0;
            if (leftCount[end] - leftCount[start - 1] == rightCount[end] - rightCount[start - 1]) {
                //length[start] = end - start;
                max = Math.max(max, end - start + 1);
                return 1;
            }
        }

        return 2;
    }

}