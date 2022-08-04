// https://leetcode.com/problems/max-consecutive-ones-iii/

// 1004. Max Consecutive Ones III

// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

// Example 1:
// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

// Example 2:
// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.


public class MaxConsecutiveOnes {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int cz=0;
        int ans=0;
        
      while(i<nums.length){
          
          if(nums[i]==0){
              cz++;
          }
          
          while(cz>k){
              if(nums[j]==0){
                  cz--;
              }
              j++;
          }
          
          int len=i-j+1;
          
          ans=Math.max(ans,len);
          i++;
      }
        
        return ans;
    }
    
}
