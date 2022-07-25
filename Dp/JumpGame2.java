// 45. Jump Game II
// https://leetcode.com/problems/jump-game-ii/

// Given an array of non-negative integers nums, you are initially positioned at the first index of the array.

// Each element in the array represents your maximum jump length at that position.

// Your goal is to reach the last index in the minimum number of jumps.

// You can assume that you can always reach the last index.

 

// Example 1:

// Input: nums = [2,3,1,1,4]
// Output: 2
// Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
// Example 2:

// Input: nums = [2,3,0,1,4]
// Output: 2

import java.util.*;
public class JumpGame2 {
    public int jump(int[] nums) {
        /*
       we will solve it using dynamic programming approach
       */
       
       //base case 
       if(nums.length < 2)
           return 0;
       
       
       //we have created this array to solve the minimum number of moves that are required to reach last index from ith index
       int[] dp = new int[nums.length];
       Arrays.fill(dp, 0);
       
       //because to reach last index from last index we require zero move
       dp[nums.length-1] = 0;
    
           for(int i = nums.length - 2; i>=0; i--){
               //we require minimum number of moves that are required to reach from ith index to last index
               int   min = Integer.MAX_VALUE  ;  
               if(nums[i] > 0){
                   //we are selecting minimum from every nump that i can make
                   for(int j = 1; j<=nums[i] && i+j<nums.length ;j++){
                   min = Math.min(min, dp[i+j]); 
                   }
               }
//if the min value has changed than we need to add one becuase we are jumping at min element index
           if(min != Integer.MAX_VALUE)
               dp[i]  = min+1;
           else
               dp[i] = min;
               
       }
       return dp[0];
   }
}
