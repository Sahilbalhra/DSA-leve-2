// The Kth MEX of an array is equal to the Kth smallest non-negative integer that is not present in the array. 


// Input:
// N = 4, K = 3,
// A = { 7, 5, 7, 1 }
// Output: 3
// Explanation: The values which are not present in 
// A are: 0, 2, 3, 4, 5..., out of which the 3rd 
// samllest value is 3.

// Input:
// N = 1, K = 1,
// A = { 2 }
// Output: 0
// Explanation: The values which are not present in 
// A are: 0, 1, 3, 4, 5..., out of which 0 is the 
// samllest value.


import java.util.*;
public class KthMex {
    static boolean find(int arr[],int val){
        int lo=0;
        int hi=arr.length-1;
        
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            
            if(arr[mid]==val){
                return true;
            }
            if(arr[mid]>val){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
            
        }
        return false;
    }
    static int kthMex(int n, int k, int arr[]) {
        // add your code here
         Arrays.sort(arr);
         ArrayList<Integer> ans=new ArrayList<>();
         int count=0;
         int j=0;
         while(count<k){
             if(find(arr,j)==false){
                 ans.add(j);
                 count++;
             }
             j++;
         }
         return ans.get(k-1);
    }
    
}
