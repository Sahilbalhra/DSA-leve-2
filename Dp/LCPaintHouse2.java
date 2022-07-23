// Paint House - Many Colors

// 1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
// 2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
// 3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

// Sample Input
// 4 3
// 1 5 7
// 5 8 4
// 3 2 9
// 1 2 4
// Sample Output
// 8

import java.util.*;
public class LCPaintHouse2 {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int [][] arr, int n, int m) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = scn.nextInt();
        }
      }
    }
  
    public static void main(String[] args) throws Exception {
      int n = scn.nextInt();
      int m = scn.nextInt();
      int [][]arr = new int[n][m];
      input(arr, n, m);
  
      int [][]dp = new int[n][m];
  
      //first row fill
  
      for (int i = 0; i < m; i++) {
        dp[0][i] = arr[0][i];
      }
  
      for (int i = 1; i < n; i++) {
        for (int j = 0; j < m; j++) {
  
          int min = Integer.MAX_VALUE;
  
          for (int k = 0; k < dp[0].length; k++) {
            if (k != j) {
              if (dp[i - 1][k] < min) {
                min = dp[i - 1][k];
              }
            }
          }
  
          dp[i][j] = arr[i][j] + min;
        }
      }
  
      int min = Integer.MAX_VALUE;
  
      for (int k = 0; k < dp[0].length; k++) {
  
        if (dp[n - 1][k] < min) {
          min = dp[n - 1][k];
        }
  
      }
      System.out.println(min);
  
    }
}
