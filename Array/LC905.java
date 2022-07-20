// https://leetcode.com/problems/sort-array-by-parity/
// 905. Sort Array By Parity
// Easy

// 3682

// 123

// Add to List

// Share
// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

// Return any array that satisfies this condition.

 

// Example 1:

// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
// Example 2:

// Input: nums = [0]
// Output: [0]

public class LC905 {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=0;
         
         while(i<nums.length){
              if(nums[i]%2==1){
                 i++;
              }else{
                  int temp=nums[i];
                  nums[i]=nums[j];
                  nums[j]=temp;
                  i++;
                  j++;
              }
          }
         return nums;
     }
    
    
}
