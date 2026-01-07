package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> HM = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(HM.containsKey(complement)){
                return new int[]{i, HM.get(complement)};
            }
            else {
                HM.put(nums[i], i);
            }
        }
        return null;
    }

    /*
    Brute force (O^n2)
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }    
        }
        return null;
    }
    */
   public static void main(String[] args) {
        TwoSum slover = new TwoSum();

        int[] nums = {2, 7, 11, 13};
        int target = 9;
        int[] ans = slover.twoSum(nums, target);

        if(ans != null){
            System.out.println("Index: " + Arrays.toString(ans));
            System.out.println("[" + nums[ans[0]] + ", " + nums[ans[1]] + "]");
        }
        else {
            System.out.println("No ans");
        }
   }
}
