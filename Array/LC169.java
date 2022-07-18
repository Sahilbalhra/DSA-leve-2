// 169. Majority Element

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// class Solution {
//     public int majorityElement(int[] nums) {
//         int n= nums.length;
//         int m=n/2;
        
//         for(int i=0;i<n;i++){
//             int count=0;
            
//             for(int j=0;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
                
//             }
            
//             if(count>m){
//                 return nums[i];
//             }
            
//         }
//         return -1;
        
//     }
// }

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//        return nums[nums.length/2];
        
//     }
// }

public class LC169 {
    class Solution {
        public int majorityElement(int[] nums) {
           int count=0;
           Integer me=null;
            for(int  i=0;i<nums.length;i++){
                
                if(count== 0){
                    me=nums[i];
                    count=1;
                }else if(nums[i]==me){
                    count++;
                }else{
                    count--;
                }
            }
            return me;
        }
    }
}
