public class JumpGameLC55 {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
       
       dp[nums.length-1] = true;
       
       for(int i=nums.length-2; i>=0; i--){
           int start = i+1;
           int end = i+nums[i];
           for(int j=start; j<=end; j++){
               if(dp[j] == true){
                   dp[i] = true;
                   break;
               }
           }
       }
       
       return dp[0];
       
   }
}
