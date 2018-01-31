package com.Algorithm.LeetCode.Simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args)
    {}

    public static List<Double> averageOfLevels(TreeNode root)
    {
        List<Double> average = new ArrayList<>();
        Queue<TreeNode> currentLevel = new LinkedList<>();
        currentLevel.add(root);
        while(!currentLevel.isEmpty())
        {
            long total = 0;
            long frequency = 0;
            Queue<TreeNode> nextLevel = new LinkedList<>();
            while(!currentLevel.isEmpty())
            {
                TreeNode t = currentLevel.remove();
                frequency ++ ;
                total += t.val;
                if(t.left != null)nextLevel.add(t.left);
                if(t.right != null)nextLevel.add(t.right);
            }
            average.add(1.0 * total / frequency);
            currentLevel = nextLevel;
        }
        return average;

    }
}
