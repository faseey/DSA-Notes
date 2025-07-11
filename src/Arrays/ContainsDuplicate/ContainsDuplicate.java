package Arrays.ContainsDuplicate;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        boolean result = containsDuplicate(nums);

        if (result) {
            System.out.println("Duplicates exist.");
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
