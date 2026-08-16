package sorting;

import java.util.Arrays;

/**
 * Problem: Merge Sort
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */
public class MergeSort {

    public void sort(int[] arr) {
        if (arr.length < 2) return;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        sort(left);
        sort(right);
        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        MergeSort solution = new MergeSort();
        int[] arr = {5, 2, 9, 1, 5, 6};
        solution.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
