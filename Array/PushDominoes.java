// https://leetcode.com/problems/push-dominoes/
// 838. Push Dominoes
// There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.

// After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.

// When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.

// For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.

// You are given a string dominoes representing the initial state where:

// dominoes[i] = 'L', if the ith domino has been pushed to the left,
// dominoes[i] = 'R', if the ith domino has been pushed to the right, and
// dominoes[i] = '.', if the ith domino has not been pushed.
// Return a string representing the final state.

 

// Example 1:

// Input: dominoes = "RR.L"
// Output: "RR.L"
// Explanation: The first domino expends no additional force on the second domino.
// Example 2:


// Input: dominoes = ".L.R...LR..L.."
// Output: "LL.RR.LLRRLL.."

public class PushDominoes {
    public String pushDominoes(String dominoes) {
        dominoes = "L" + dominoes + "R";
      int pi = 0;
      char[] arr = dominoes.toCharArray();
      
      for(int i=1; i<arr.length; i++) {
          if(arr[i] == 'L') {
              //curr left
              if(arr[pi] == 'L') {
                  //prev left
                  for(int x = pi + 1; x < i; x++) {
                      arr[x] = 'L';
                  }
              } else if(arr[pi] == 'R') {
                  //prev right
                  int lo = pi + 1;
                  int hi = i-1;
                  
                  while(lo < hi) {
                      arr[lo] = 'R';
                      arr[hi] = 'L';
                      
                      lo += 1;
                      hi -= 1;
                  }
              }
              
              pi = i;
          } else if(arr[i] == 'R') {
              //curr right
              if(arr[pi] == 'L') {
                  //prev left
                  // do nothing
              } else if(arr[pi] == 'R') {
                  //prev right
                  for(int x = pi + 1; x < i; x++) {
                      arr[x] = 'R';
                  }
              }
              
              pi = i;
          }
      }
      
      StringBuilder sb = new StringBuilder();
      for(int i=1; i<arr.length - 1; i++) {
          sb.append(arr[i]);
      }
      
      return sb.toString();
      
  }
    
}
