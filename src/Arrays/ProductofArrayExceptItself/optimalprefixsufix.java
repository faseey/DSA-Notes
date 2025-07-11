package Arrays.ProductofArrayExceptItself;

public class optimalprefixsufix {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: Build prefix product directly into ans[]
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with running suffix product
        int rp = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * rp;
            rp *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

