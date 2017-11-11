package Algorithm.LeetCode;

import java.util.*;

public class EmployeeImportance {
    public static void main(String[] args)
    {}

    public static int getImportance(List<Employee> employees, int id)
    {
        int ans = 0;
        Employee tar = new Employee();
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for(Employee e : employees)employeeMap.put(e.id, e);
        Queue<Employee> queue = new LinkedList<>();
        if(employeeMap.containsKey(id)) {tar = employeeMap.get(id);queue.add(tar);}
        while(!queue.isEmpty()) {
            Queue<Employee> temp = new LinkedList<>();
            while (!queue.isEmpty())
            {
                Employee e = queue.remove();
                ans += e.importance;
                if (e.subordinates != null) { for (int i : e.subordinates) temp.add(employeeMap.get(i)); }
            }
            queue = temp;
        }
        return ans;
    }
}
