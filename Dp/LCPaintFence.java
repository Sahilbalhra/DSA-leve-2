// Paint Fence
// 1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
// 2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive  fences have same colors.

import java.util.*;
public class LCPaintFence {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k=scn.nextInt();
        
        int [] same=new int[n+1];
        int [] diff =new int[n+1];
        int [] total=new int[n+1];
        same[1]=0;
        diff[1]=0;
        total[1]=same[1]+diff[1];
        same[2]=k;
        diff[2]=k*(k-1);
        total[2]=same[2]+diff[2];
        
        for(int i=3;i<=n;i++){
            same[i]=diff[i-1];
            diff[i]=total[i-1]*(k-1);
            total[i]=same[i]+diff[i];
        }
        System.out.println(total[n]);
        scn.close();
    }
}
