package Arrays.TopKFrququentElemnets;



import java.util.*;

public class topkviaHashmap {

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Convert entry set to list and sort by frequency in descending order
        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(freqMap.entrySet());
        sortedList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        // Collect top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = sortedList.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 4};
        int k = 2;

        int[] result = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));
    }
}
