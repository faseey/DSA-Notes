package Arrays.ProductofArrayExceptItself;

public class DiviosionApproach {




        public static int[] productExceptSelf(int[] nums) {
            int[] ans = new int[nums.length];
            int product = 1;
            boolean zeroSeen = false;
            boolean secondZero = false;

            // First pass: calculate product ignoring up to one zero
            for (int num : nums) {
                if (num == 0) {
                    if (!zeroSeen) {
                        zeroSeen = true;
                    } else {
                        secondZero = true;
                    }
                } else {
                    product *= num;
                }
            }

            // Second pass: build result array
            for (int i = 0; i < nums.length; i++) {
                if (secondZero) {
                    ans[i] = 0;
                } else if (zeroSeen) {
                    ans[i] = (nums[i] == 0) ? product : 0;
                } else {
                    ans[i] = product / nums[i];
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4};
            int[] result = productExceptSelf(nums);

            for (int n : result) {
                System.out.print(n + " ");
            }
        }
    }


