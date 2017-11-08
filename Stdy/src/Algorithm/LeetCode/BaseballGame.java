package Algorithm.LeetCode;

import java.util.ArrayList;

public class BaseballGame {
    public static void main(String[] args)
    {
        String[] ops ={"5", "2", "C", "D", "+"};
        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.print(calPoints(ops2));
    }

    public static int calPoints(String[] ops)
    {
        int roundpoint = 0;
        int points = 0;
        ArrayList<Integer> validPoints = new ArrayList<>();
        for (String op : ops) {
            switch (op) {
                case "C":
                    points -= validPoints.get(validPoints.size() - 1);
                    validPoints.remove(validPoints.size() - 1);

                    break;
                case "D":
                    roundpoint = 2 * validPoints.get(validPoints.size() - 1);
                    points += roundpoint;
                    validPoints.add(roundpoint);
                    break;
                case "+":
                    roundpoint = (validPoints.get(validPoints.size() - 2) + validPoints.get(validPoints.size() - 1));
                    points += roundpoint;
                    validPoints.add(roundpoint);
                    break;
                default:
                    roundpoint = Integer.valueOf(op);
                    points += roundpoint;
                    validPoints.add(roundpoint);
                    break;
            }
        }
        return points;
    }
}
