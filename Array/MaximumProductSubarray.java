// 152. Maximum Product Subarray

// https://leetcode.com/problems/maximum-product-subarray/

// Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

// The test cases are generated so that the answer will fit in a 32-bit integer.

// A subarray is a contiguous subsequence of the array.

 

// Example 1:

// Input: nums = [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:

// Input: nums = [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) 
    {
       int ans=Integer.MIN_VALUE;
        int p=1;
        for(int i=0;i<nums.length;i++){
            p=p*nums[i];
            if(p>ans){
                ans=Math.max(ans,p);
            }
            if(p==0){
               p=1; 
            } 
            
        }
        p=1;
        for(int i=nums.length-1;i>=0;i--){
            p=p*nums[i];
        
                ans=Math.max(ans,p);
            
            if(p==0){
               p=1; 
            } 
            
        }
        
        return ans;
    }
}
