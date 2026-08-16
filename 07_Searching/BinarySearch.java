package searching;

/**
 * Problem: Binary Search
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class BinarySearch {

    public int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        int[] arr = {1, 3, 5, 7, 9, 11};
        System.out.println("Index of 7: " + solution.search(arr, 7));
    }
}
