package Array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    // O(n^2)
    // public boolean containsDuplicate(int[] nums) {
    // for (int i = 0; i < nums.length - 1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] == nums[j])
    // return true;
    // }
    // }
    // return false;
    // }

    // O(n) - Kiểm tra theo chỉ số
    // public boolean containsDuplicate(int[] nums) {
    //     HashSet<Integer> HS = new HashSet<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (HS.contains(nums[i]))
    //             return true;
    //         else
    //             HS.add(nums[i]);
    //     }
    //     return false;
    // }

    // O(n) - Kiểm tra theo giá trị
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            else set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();

        int[] nums = { 1, 2, 5, 7, 1 };
        System.out.println("nums = " + Arrays.toString(nums) + " -> " + cd.containsDuplicate(nums));
    }
}
