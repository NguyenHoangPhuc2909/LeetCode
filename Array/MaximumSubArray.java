package Array;

public class MaximumSubArray {
    // O(n^3)
    // public int maxSubArray(int[] nums) {
    // int len = nums.length;
    // int largestSum = 0;
    // for (int i = 0; i < len; i++) {
    // for (int j = i; j < len; j++) {
    // int sum = 0;
    // for (int k = i; k <= j; k++) {
    // sum += nums[k];
    // }
    // if(sum > largestSum) largestSum = sum;
    // }
    // }
    // return largestSum;
    // }

    // O(n^2)
    // public int maxSubArray(int[] nums) {
    // int largestSum = nums[0];
    // for (int i = 0; i < nums.length; i++) {
    // int sum = 0;
    // for (int j = i; j < nums.length; j++) {
    // sum += nums[j];
    // if (sum > largestSum)
    // largestSum = sum;
    // }
    // }
    // return largestSum;
    // }

    // O(n)
    // public int maxSubArray(int[] nums) {
    // int max = nums[0];
    // int maxsofar = nums[0];
    // for(int i = 0; i < nums.length; i++) {
    // maxsofar = Math.max(nums[i], maxsofar + nums[i]);
    // max = Math.max(maxsofar, max);
    // }
    // return max;
    // }

    // O(n)
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            max = Math.max(curSum, max);
            if (curSum < 0)
                curSum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumSubArray max = new MaximumSubArray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int largestSum = max.maxSubArray(nums);

        System.out.println(largestSum);
    }
}
