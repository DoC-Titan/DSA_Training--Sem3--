package DAY7;

import java.util.Arrays;

public class Target {

    static int[] findSubarrayIndices(int[] arr, int k, int target) {
        if (arr.length < k) return new int[]{-1, -1};

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }


        if (sum == target) {
            return new int[]{0, k - 1};
        }


        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];

            if (sum == target) {
                int startIndex = i - k + 1;
                int endIndex = i;
                return new int[]{startIndex, endIndex};
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 7, 5, 8, 1};
        int target = 9;
        int k = 2;

        int[] indices = findSubarrayIndices(arr, k, target);

        if (indices[0] != -1) {
            System.out.println("Subarray found between indices: " + Arrays.toString(indices));
        } else {
            System.out.println("No matching subarray found.");
        }
    }
}