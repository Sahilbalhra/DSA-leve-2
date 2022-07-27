// https://leetcode.com/problems/consecutive-numbers-sum/

// 829. Consecutive Numbers Sum

// Given an integer n, return the number of ways you can write n as the sum of consecutive positive integers.

 

// Example 1:

// Input: n = 5
// Output: 2
// Explanation: 5 = 2 + 3
// Example 2:

// Input: n = 9
// Output: 3
// Explanation: 9 = 4 + 5 = 2 + 3 + 4

public class ConsecutiveNumbersSum {
    public int consecutiveNumbersSum(int n) {
        int ans=0;
        
        int k=1;
        
        int check=k*(k-1)/2;
        
        while(check<n){
              if((n-check)%k==0){
                  ans++;
              }
            k++;
            check =k*(k-1)/2;
        }
        return ans;
        
    }
}
