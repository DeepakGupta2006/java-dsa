package backtracking;

import java.util.*;

/**
 * Problem: Generate all Permutations of an array
 * Time Complexity: O(n * n!)
 * Space Complexity: O(n)
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int num : nums) {
            if (current.contains(num)) continue;
            current.add(num);
            backtrack(result, current, nums);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Permutations solution = new Permutations();
        System.out.println(solution.permute(new int[]{1, 2, 3}));
    }
}
