// 1. You are given a number N representing number of elements.
// 2. You are given N space separated numbers (ELE : elements).
// 3. Your task is to find & print  
//     3.1) Length of "Longest Increasing Subsequence"(LIS).
//     3.2) All "Longest Increasing Subsequence(s)"(LIS).
// NOTE: Checkout sample question/solution video inorder to have more insight.

import java.util.*;

public class LongestIncreasingSubsequence3  {

  public static class Pair {
    int l;
    int i;
    int v;
    String psf;

    Pair(int l, int i, int v, String psf) {
      this.l = l;
      this.i = i;
      this.v = v;
      this.psf = psf;
    }
  }

  public static void solution(int []arr) {
    int[] dp = new int[arr.length];
    int omax = 0;

    for (int i = 0; i < dp.length; i++) {
      int max = 0;

      for (int j = 0; j < i; j++) {
        if (arr[j] <= arr[i]) {
          if (dp[j] > max) {
            max = dp[j];
          }
        }
      }

      dp[i] = max + 1;
      if (dp[i] > omax) {
        omax = dp[i];
      }
    }

    System.out.println(omax);

    ArrayDeque<Pair> queue = new ArrayDeque<>();

    for (int i = 0; i < dp.length; i++) {
      if (omax == dp[i]) {
        queue.add(new Pair(omax, i, arr[i], arr[i] + ""));
      }
    }

    while (queue.size() > 0) {
      Pair rem = queue.removeFirst();

      if (rem.l == 1) {
        System.out.println(rem.psf);
      }

      for (int j = rem.i - 1; j >= 0; j--) {
        if (dp[j] == rem.l - 1 && arr[j] <= rem.v) {
          queue.add(new Pair(dp[j], j, arr[j], arr[j] + " -> " + rem.psf));
        }
      }
    }
  }



  public static void main(String []args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int i = 0 ; i < n ; i++) {
      arr[i] = scn.nextInt();
    }

    solution(arr);

    scn.close();
  }
}