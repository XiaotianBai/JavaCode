package Algorithm.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args)
    {
        int[] array = {1,3,5,7};
        int target = 4;
        int[] answer1 = bruteForce(array, target);
        int[] answer2 = betterSolution(array, target);
        System.out.print(Arrays.toString(answer1));
        System.out.print(Arrays.toString(answer2));
    }


    public static int[] bruteForce(int[] array, int target)
    {
        int[] solution = {0, 0};
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1 ; j < array.length; j++)
            {
                if(array[i] + array[j] == target)
                {solution[0] = i;
                solution[1] = j;
                }

            }
        }

        return solution;
    }

    public static int[] betterSolution(int[] array, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int[] solution = {0, 0};
        for(int i = 0; i < array.length; i++)
        {
            map.put(Integer.valueOf(array[i]), Integer.valueOf(i));
        }
        for(int i = 0; i < array.length; i++)
        {
            if (map.containsKey(target - array[i]) && map.get(target - array[i]) > i)
            {
                solution[0] = i;
                solution[1] = map.get(target - array[i]);
            }
        }
        return solution;
    }
}
