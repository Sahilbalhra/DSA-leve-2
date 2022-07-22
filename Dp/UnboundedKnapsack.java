// 1. You are given a number n, representing the count of items.
// 2. You are given n numbers, representing the values of n items.
// 3. You are given n numbers, representing the weights of n items.
// 3. You are given a number "cap", which is the capacity of a bag you've.
// 4. You are required to calculate and print the maximum value that can be created in the bag without 
//     overflowing it's capacity.
// Note -> Each item can be taken any number of times. You are allowed to put the same item again and again


import java.util.*;
public class UnboundedKnapsack {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int [] arr) {
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
      }
    }
  
    public static void main(String[] args) throws Exception {
      int n = scn.nextInt();
      int [] vals = new int[n];
      int [] wts = new int[n];
      input(vals);
      input(wts);
  
      int bcap = scn.nextInt();
  
      int []dp = new int[bcap + 1];
      dp[0] = 0;
      //loop for the bag capacity
  
      for (int cap = 1; cap <= bcap; cap++) {
        //for storing the max value
        int max = 0;
        for (int i = 0; i < n; i++) {
          //chacking bag mai dal sqakta hai k nhi
          if (wts[i] <= cap) {
            int rbagc = cap - wts[i];
            int rbagv = dp[rbagc];
            int tbagv = rbagv + vals[i];
  
            if (tbagv > max) {
              max = tbagv;
            }
          }
  
        }
        dp[cap] = max;
  
      }
      System.out.println(dp[bcap]);
      scn.close();
    }
}
