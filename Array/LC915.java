// 915. Partition Array into Disjoint Intervals

// https://leetcode.com/problems/partition-array-into-disjoint-intervals/

// Given an integer array nums, partition it into two (contiguous) subarrays left and right so that:

// Every element in left is less than or equal to every element in right.
// left and right are non-empty.
// left has the smallest possible size.
// Return the length of left after such a partitioning.

// Test cases are generated such that partitioning exists.

 

// Example 1:

// Input: nums = [5,0,3,8,6]
// Output: 3
// Explanation: left = [5,0,3], right = [8,6]
// Example 2:

// Input: nums = [1,1,1,0,6,12]
// Output: 4
// Explanation: left = [1,1,1,0], right = [6,12]

public class LC915 {
    public int partitionDisjoint(int[] nums) {
        //partion idx
        int pi=0;
        //max till the partion
        int mtp=nums[0];
        //max till scn 
        int mts=nums[0];
        
        for(int i=1;i<nums.length;i++){
            mts=Math.max(mts,nums[i]);
            
            if(nums[i]<mtp){
                pi=i;
                mtp=mts;
                
            }
        }
        return pi+1;
        
    }
}
