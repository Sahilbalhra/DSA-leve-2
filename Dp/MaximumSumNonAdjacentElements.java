// Maximum Sum Non Adjacent Elements
// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers, representing n elements.
// 3. You are required to find the maximum sum of a subsequence with no adjacent elements.

// Sample Input
// 6
// 5
// 10
// 10
// 100
// 5
// 6
// Sample Output
// 116

import java.util.*;
public class MaximumSumNonAdjacentElements {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int [] inc=new int[n];
        int [] exc=new int[n];
        
        inc[0]=arr[0];
        exc[0]=0;
        
        for(int i=1;i<n;i++){
            inc[i]=exc[i-1]+arr[i];
            exc[i]=Math.max(inc[i-1],exc[i-1]);
        }
        System.out.println(Math.max(inc[n-1],exc[n-1]));
         
        scn.close();
    }
}
