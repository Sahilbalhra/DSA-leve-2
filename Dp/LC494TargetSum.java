// https://leetcode.com/problems/target-sum/

// 494. Target Sum

// You are given an integer array nums and an integer target.

// You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

// For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
// Return the number of different expressions that you can build, which evaluates to target.

 

// Example 1:

// Input: nums = [1,1,1,1,1], target = 3
// Output: 5
// Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
// -1 + 1 + 1 + 1 + 1 = 3
// +1 - 1 + 1 + 1 + 1 = 3
// +1 + 1 - 1 + 1 + 1 = 3
// +1 + 1 + 1 - 1 + 1 = 3
// +1 + 1 + 1 + 1 - 1 = 3
// Example 2:

// Input: nums = [1], target = 1
// Output: 1

public class LC494TargetSum {
    class Solution {
        public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        
        for(int i=0;i<n;i++)
            sum+=nums[i];
        
       if((sum-target)%2==1 || (target>sum)) 
           return 0;
        
        sum=(sum+target)/2;
            
        if(sum<0)
            return 0;
        return getCount(nums,sum,nums.length);
    }
    public int getCount(int[] nums,int target,int size){
        int[][] arr = new int[size+1][target+1];
        for(int i=0;i<size+1;i++){
            for(int j=0;j<target+1;j++){
            if(i==0) arr[i][j]=0;
            if(j==0) arr[i][j]=1;
        } 
        }
        
        for(int i=1;i<size+1;i++){
            for(int j=0;j<target+1;j++){
            if(nums[i-1]>j) arr[i][j]=arr[i-1][j];
            else arr[i][j]=arr[i-1][j - nums[i-1]]+arr[i-1][j];
        } 
        }
        return arr[size][target];
    }
    }
}
