package Array;

public class ProducttoArrayExceptSelf {
    // Space O(n), Time O(n)
    // public int[] producttExceptSelf(int[] nums) {
    // int len = nums.length;
    // int[] ans = new int[len];
    // int[] left = new int[len];
    // int[] right = new int[len];

    // // fill the left array
    // left[0] = 1;
    // for (int i = 1; i < len; i++) {
    // left[i] = left[i - 1] * nums[i - 1];
    // }

    // // fill the right array
    // right[len - 1] = 1;
    // for (int j = len - 2; j >= 0; j--) {
    // right[j] = right[j + 1] * nums[j + 1];
    // }

    // // fill the ans array
    // for (int k = 0; k < len; k++) {
    // ans[k] = left[k] * right[k];
    // }
    // return ans;
    // }

    // Space O(1), Time O(n)
    // ans stores prefix products; then multiply by suffix product tracked by
    // 'right'
    public int[] producttExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];

        // step: the same thing as fillin the left array
        // Build prefix products in ans: ans[i] = product of nums[0..i-1]
        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // right: product of nums[] in the right
        int right = 1;
        for (int i = len - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        ProducttoArrayExceptSelf pd = new ProducttoArrayExceptSelf();
        int[] nums = { 1, 2, 3, 4 };

        int[] answer = pd.producttExceptSelf(nums);

        System.out.print("[");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if (i < answer.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}