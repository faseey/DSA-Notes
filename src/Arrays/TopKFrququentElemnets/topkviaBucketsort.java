package Arrays.TopKFrququentElemnets;
import java.util.*;
public class topkviaBucketsort {



        public static int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();

            // Step 1: Count frequencies
            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            // Step 2: Create bucket array where index = frequency
            List<Integer>[] bucket = new List[nums.length + 1];

            for (int key : map.keySet()) {
                int freq = map.get(key);
                if (bucket[freq] == null) {
                    bucket[freq] = new ArrayList<>();
                }
                bucket[freq].add(key);
            }

            // Step 3: Gather top K frequent elements
            int[] result = new int[k];
            int count = 0;

            for (int i = bucket.length - 1; i >= 0 && count < k; i--) {
                if (bucket[i] != null) {
                    for (int num : bucket[i]) {
                        result[count++] = num;
                        if (count == k) break;

                    }
                }
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 1, 2, 2, 3,4,4};
            int k = 2;
            int[] result = topKFrequent(nums, k);

            System.out.println("Top " + k + " frequent elements:");
            for (int val : result) {
                System.out.print(val + " ");
            }
        }
    }


