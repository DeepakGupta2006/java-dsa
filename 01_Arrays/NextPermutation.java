package arrays;

/**
 * Problem: Next Permutation
 * Given an array of integers, rearrange it into the lexicographically
 * next greater permutation. If no such arrangement exists, rearrange
 * it into the lowest possible order (sorted ascending).
 *
 * Approach:
 * 1. Find the largest index i such that nums[i] < nums[i+1] (pivot).
 * 2. If no such index exists, the array is the last permutation -> reverse it.
 * 3. Otherwise, find the largest index j > i such that nums[j] > nums[i].
 * 4. Swap nums[i] and nums[j].
 * 5. Reverse the sub-array from i+1 to the end.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: find pivot
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 3 & 4: find rightmost successor and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 5: reverse suffix
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        NextPermutation solution = new NextPermutation();
        int[] nums = {1, 2, 3};
        solution.nextPermutation(nums);
        System.out.print("Next Permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
