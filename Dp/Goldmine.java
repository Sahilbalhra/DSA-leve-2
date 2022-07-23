// . You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
// 4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from 
//      any row in the left wall.
// 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
import java.util.*;

public class Goldmine {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][]arr = new int[n][m];
    
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < m; j++) {
            arr[i][j] = scn.nextInt();
          }
        }
    
        int [][] dp = new int[n][m];
        for (int j = m - 1; j >= 0; j--) {
          for (int i = n - 1; i >= 0; i--) {
            if (j == m - 1) {
              //last col
              dp[i][j] = arr[i][j];
            } else if (i == 0) {
              //first row
              dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j + 1]) + arr[i][j];
            } else if (i==n-1) {
              //last row
              dp[i][j] = Math.max(dp[i - 1][j + 1], dp[i][j + 1]) + arr[i][j];
            } else {
              //remaining
              dp[i][j] = Math.max(dp[i][j + 1], Math.max(dp[i-1][j + 1], dp[i + 1][j + 1])) + arr[i][j];
            }
    
          }
        }
    
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
          if (dp[i][0] > max) {
            max = dp[i][0];
            
          }
        //   System.out.println(dp[i][0]);
        }
    
        System.out.println(max);
    scn.close();
    
      }
    
}
