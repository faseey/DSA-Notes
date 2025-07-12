package Arrays.LongestConsecutiveSequence;

import java.util.*;

public class Solution {

    // Brute Force: Sorting-based approach
    // Time Complexity: O(n log n) due to sorting
    // Space Complexity: O(1) if in-place sort is allowed
    public static int longestConsecutiveBrute(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);  // O(n log n)
        int maxSeq = 1;
        int count = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) continue; // skip duplicates

            if (nums[i] + 1 == nums[i + 1]) {
                count++;
            } else {
                maxSeq = Math.max(maxSeq, count);
                count = 1;
            }
        }

        return Math.max(maxSeq, count);
    }

    // Optimal: HashSet-based approach
    // Time Complexity: O(n)
    // Space Complexity: O(n) for the HashSet
    public static int longestConsecutiveOptimal(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);  // O(n)
        }

        int max = 0;

        for (int num : set) {
            // Check only for the start of a sequence
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                // Count consecutive elements
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }

    // Main method to test both approaches
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println("Brute Force (Sorting): " + longestConsecutiveBrute(nums));
        System.out.println("Optimal (HashSet): " + longestConsecutiveOptimal(nums));
    }
}
