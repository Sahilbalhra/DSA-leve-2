// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number "tar".
// 4. You are required to calculate and print true or false, if there is a subset the elements of which add 
//      up to "tar" or not.

import java.util.*;
public class TargetSum {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int t= scn.nextInt();
        
        boolean [][] dp=new boolean [n+1][t+1];
        
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(i==0 && j==0){
                    //0 runs 0 person bna sakte hai
                    dp[i][j]=true;
                }else if(i==0){
                    // 1 2 3 4 5 6 .. run 0 person nhi bna sakta
                    dp[i][j]=false;
                }else if(j==0){
                    //0 run sab bna sakte hai
                    dp[i][j]=true;
                }else{
                    if(dp[i-1][j]==true){
                        //runs phele hi bn gye
                        dp[i][j]=true;
                        
                    }else{
                        //nhi bne hai
                         int val=arr[i-1];
                         
                         //iss se phele ke logo ne runs bna rahkhe h bs esi k rhte hai
                         if(val<=j){
                             if(dp[i-1][j-val]==true){
                                 dp[i][j]=true;
                             }
                         }
                        
                    }
                }
            }
        }
        System.out.println(dp[n][t]);
        
        
    
}
