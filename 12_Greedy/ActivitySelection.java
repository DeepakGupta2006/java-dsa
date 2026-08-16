package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Problem: Activity Selection
 * Given start and end times of activities, select the maximum number
 * of non-overlapping activities.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */
public class ActivitySelection {

    public int maxActivities(int[][] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 1;
        int lastEnd = activities[0][1];

        for (int i = 1; i < activities.length; i++) {
            if (activities[i][0] >= lastEnd) {
                count++;
                lastEnd = activities[i][1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ActivitySelection solution = new ActivitySelection();
        int[][] activities = {{1, 3}, {2, 5}, {4, 6}, {6, 8}, {5, 9}};
        System.out.println("Max activities: " + solution.maxActivities(activities));
    }
}
