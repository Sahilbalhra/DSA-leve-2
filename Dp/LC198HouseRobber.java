// https://leetcode.com/problems/house-robber/

// Example 1:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
// Example 2:

// Input: nums = [2,7,9,3,1]
// Output: 12
// Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
// Total amount you can rob = 2 + 9 + 1 = 12

public class LC198HouseRobber{

    public int rob(int[] nums) {
        // some base cases
        if(nums.length == 0 || nums == null)
            return 0;
        else if(nums.length == 1)
            return nums[0];
        
        // result
        int[] robbed = new int [nums.length];
        robbed[0] = nums[0];    
        robbed[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i < nums.length; i++) {
            // current house value = last hour vs 2 houses away + current house
            robbed[i] = Math.max(robbed[i - 1], robbed[i - 2] + nums[i]);
        }        
        return robbed[nums.length-1];
    }
}