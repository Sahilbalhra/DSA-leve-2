// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. In one move, you are allowed to climb 1, 2 or 3 stairs.
// 4. You are required to print the number of different paths via which you can climb to the top.
import java.util.*;

public class ClimbStairs {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // System.out.println(climb(n).size());
    System.out.println(climb(n,new int[n+1]));
    scn.close();
    
  }
//   public static ArrayList<String> climb(int n) {
//     if (n == 0) {
//       ArrayList<String>base= new ArrayList<>();
//       base.add("");
//       return base;
//     }
//     ArrayList<String>ans= new ArrayList<>();
//     for(int i=1;i<=3;i++){
//         if(n-i>=0){
//             ArrayList<String> rc=climb(n-i);
//             for(String s:rc){
//                 ans.add(i+s);
//             }
//         }
//     }

//     return ans;
//   }

public static int climb(int n,int []qb){
    if(n==0){
        return 1;
    }else if(n<0){
        return 0;
    }
    
    if(qb[n]>0){
        return qb[n];
        
    }
    
    int num1=climb(n-1,qb);
     int num2=climb(n-2,qb);
      int num3=climb(n-3,qb);
      qb[n]=num1+num2+num3;
      return num1+num2+num3;
    
    
}

}